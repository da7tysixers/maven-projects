package com.orubele.springannotation;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Component
public class MyCustomBeanProcessor implements BeanPostProcessor,
BeanFactoryAware,
DisposableBean {
	
	private BeanFactory beanFactory;
	private final List<Object> beanList = new LinkedList<Object>();
	
	

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanFactory.isPrototype(beanName)) {
			synchronized (beanList) {
				beanList.add(bean);
			}
		}
		return bean;
	}

	@Override
	public void destroy() throws Exception {
		// loop through the prototype beans and call the destroy() mehtod on each one
		synchronized (beanList) {
			for (Object bean : beanList) {
				if (bean instanceof DisposableBean) {
					DisposableBean dispose = (DisposableBean) bean;
					try {
						dispose.destroy();
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				}
			}// for each
			beanList.clear();
		}// synchronize
		
		
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		this.beanFactory = beanFactory;
		
	}

}

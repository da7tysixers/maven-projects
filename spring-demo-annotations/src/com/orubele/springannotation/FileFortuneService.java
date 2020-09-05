package com.orubele.springannotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
class FileFortuneService implements FortuneService{
	private List<String> fortuneList;
	private String filePath = "src/fortune-data.txt";
	private File file = new File(filePath);
	Random myRandom = new Random();
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside the constructor");
	}
	
	@PostConstruct
	private void loadTheFortune() {
		fortuneList = new ArrayList<String>();
		System.out.println("reading from a file " + file);
		System.out.println("the file exist " + file.exists());
		
		try (BufferedReader buffer = new BufferedReader(new FileReader(file))){
			String tempLine;
			while ((tempLine = buffer.readLine()) != null) {
				fortuneList.add(tempLine);
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	
	

	@Override
	public String getFortune(){
		int index = myRandom.nextInt(fortuneList.size());
		String result = fortuneList.get(index);
		return result;
	}
	
}

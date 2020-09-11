package com.book.management;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookManager {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	public static void main(String[] args) {
		try {
		begin();
		
		read();
		end();
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			entityManager.close();
			factory.close();
		}
		
	}//main method
	
	
	

	public static void end() {
		entityManager.getTransaction().commit();
	}

	public static void begin() {
		factory = Persistence.createEntityManagerFactory("book-unit");
		entityManager = factory.createEntityManager();
		
		entityManager.getTransaction().begin();
	}

	public static void createEntity() {
		Book newBook = new Book();
		newBook.setTitle("Effective Java");
		newBook.setAuthor("Jude Brooks");
		newBook.setPrice(34f);
		entityManager.persist(newBook);
	}
	
	
	public static void update() {
		Book updateEntity = new Book();
		updateEntity.setBookId(1);
		updateEntity.setAuthor("frankiestan jones");
		updateEntity.setTitle("Java Fundamentals");
		updateEntity.setPrice(10f);
		entityManager.merge(updateEntity);
	}
	
	private static void read() {
		Integer primaryKey = 1;
		Book book = entityManager.find(Book.class, primaryKey);
		System.out.println(book.getAuthor());
		System.out.println(book.getTitle());
		System.out.println(book.getPrice());
	}
}

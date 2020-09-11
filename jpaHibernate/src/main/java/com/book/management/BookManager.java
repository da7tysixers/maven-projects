package com.book.management;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;


public class BookManager {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	public static void main(String[] args) {
		try {
		begin();
		
		//query();
		update();
		//createEntity();
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
		//newBook.setBookId(2);
		newBook.setTitle("Java Head Start");
		newBook.setAuthor("Judge Framlo");
		newBook.setPrice(34f);
		entityManager.persist(newBook);
	}
	
	
	public static void update() {
		Book updateEntity = new Book();
		updateEntity.setBookId(2);
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
	
	private static void query() {
		String jpql = "select b from Book b where b.price < 30";
		Query sqlQuery = entityManager.createQuery(jpql);
		List<Book> booksList = sqlQuery.getResultList();
		for (Book book : booksList) {
			System.out.println(book.getAuthor() + "\n" +
			book.getTitle() + "\n" +
			book.getPrice() + "\n \n");
			
		
		}
	
		
	}
	
	private static void delete() {
		Integer primaryKey = 3;
		Book reference = entityManager.getReference(Book.class, primaryKey);
		entityManager.remove(reference);
	}
}

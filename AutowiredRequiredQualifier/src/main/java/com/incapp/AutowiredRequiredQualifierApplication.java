package com.incapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.incapp.bean.Book;
import com.incapp.bean.Category;

@SpringBootApplication
public class AutowiredRequiredQualifierApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(AutowiredRequiredQualifierApplication.class, args);
		
		Book b = context.getBean(Book.class);
		
		Category category = b.getCategory();
		System.out.println(category);
		System.out.println(category.printCategory());
		System.out.println("_________");
		
		b.setAuthor("Satyadev");
		b.setPrice(500);
		
		System.out.println(b.getPrice());
		System.out.println(b.getAuthor());
		
		Book b2 = context.getBean(Book.class);
		
		System.out.println("____________");
		System.out.println(b2.getPrice());
		System.out.println(b2.getAuthor());
	}

}

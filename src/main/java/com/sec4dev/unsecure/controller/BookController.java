package com.sec4dev.unsecure.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sec4dev.unsecure.model.Book;

@RestController 
public class BookController {

	private static Map<Integer, Book> bookstore = new HashMap<>();
	
	static {
		Book book1 = new Book(123,"The Holly Bible","Various");
		bookstore.put(book1.getId(), book1);
		
		Book book2 = new Book(200,"API Security in Action","Neil Madden");
		bookstore.put(book2.getId(), book2);
		
		Book book3 = new Book(358,"Modern API Development with Spring and Spring Boot","Sourabh Sharma");
		bookstore.put(book3.getId(), book3);
	}
	
	@RequestMapping(value = "/book")
	public ResponseEntity<Object> getBook(@RequestParam("bookid") Integer bookid){
		return new ResponseEntity<>(bookstore.get(bookid), HttpStatus.OK);
	}

}

package com.firstSpringBoot.controller;

import java.util.List;

import com.firstSpringBoot.model.book;
import com.firstSpringBoot.service.bookservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class bookController {

	
	@Autowired
	private bookservice service;
	//handling the request
	//controller all get books
	@RequestMapping( method = RequestMethod.GET,value = "/books")          // method 1
	// processing the request
	public List<book> getbooks(){
		return service.getAllBooks();
	   }
	
	
	// controller to get specified book id
	@RequestMapping( method = RequestMethod.GET,value="/books/{id}")       // method 2
	public book getbook(@PathVariable int id) {
		return service.getbook(id);
	}
	
	// controller to  adding new book data
	@RequestMapping(method = RequestMethod.POST,value="/books")           // method 3
	public void addbook(@RequestBody book b1) {
		service.addbook(b1);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT,value="/books/{id}")
	public void updatebook(@RequestBody book p2 ,@PathVariable int id) {
		service.updatebook(p2, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value="/books/{id}")
	public void deletebook( @PathVariable int id) {
		service.deletebook(id);
		
	}
	
	
}

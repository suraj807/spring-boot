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
	@RequestMapping( method = RequestMethod.GET,value = "/books")          // method 1
	// processing the request
	public List<book> getbooks(){
		return service.getAllBooks();
	   }
	
	@RequestMapping( method = RequestMethod.GET,value="/books/{id}")       // method 2
	public book getbook(@PathVariable int id) {
		return service.getbook(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/books")
	public void addbook(@RequestBody book b1) {
		service.addbook(b1);
	}
	
	
}

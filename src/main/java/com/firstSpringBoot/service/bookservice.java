package com.firstSpringBoot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.firstSpringBoot.model.book;

import org.springframework.stereotype.Service;

@Service
public class bookservice {
	
	List<book>bookList=new ArrayList<>(Arrays.asList(
			
			new book( 1,"ramyan",1001,1),
			new book( 2,"gete",501,7),
			new book( 3,"kuran",100,2),
			new book(4,"java",100,6),
			new book(6,"c++",200,7),
			new book(7,"python",300,8),
			new book(8,"php",50,9)
	         ));
	/// return all books
	public List<book>getAllBooks(){
		return bookList;
	}
	
	public book getbook(int id) {
		return bookList.stream().filter(pro->pro.getId()==id).findFirst().get();
	}
	
	public void addbook(book b1) {
		bookList.add(b1);
	}

	
	

}

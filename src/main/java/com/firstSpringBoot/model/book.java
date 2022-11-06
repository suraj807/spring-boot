package com.firstSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class book {
	
	public int id;
	public String bookname;
	public int bookprice;
	public int bookAvail;

}

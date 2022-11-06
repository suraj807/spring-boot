package com.start;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class suraj {
	
	@Autowired
	dev hi;
	public void hello() {
		System.out.println("welcome to new start project in spring project");
		hi.laptop();
	
	}

}

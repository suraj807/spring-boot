package com.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StartprojectApplication {

	public static void main(String[] args) {
		//ApplicationContext=con  SpringApplication.run(StartprojectApplication.class, args);
		
		
		ApplicationContext con= SpringApplication.run(StartprojectApplication.class, args);
		
		
		
		
          suraj sun =con.getBean(suraj.class);
          sun.hello();

	}

}

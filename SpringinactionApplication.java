package com.example.springinaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringinactionApplication {

	private Dessert des;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringinactionApplication.class, args);
	}
	
	@Autowired
	//@Qualifier("ice")
	@Ice
	@Cold
	public void setObject(Dessert des)
	{
		this.des = des;
		des.display();
	}
	
	
	
}

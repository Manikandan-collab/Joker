package com.example.springinaction;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Ice
public class Popsicle implements Dessert {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Popsicle Class...");
	}

}

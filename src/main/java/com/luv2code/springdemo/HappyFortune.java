package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune {

	public String getMessage() {
		return "Happy day !";
	}
	
}

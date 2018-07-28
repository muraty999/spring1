package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements Fortune {

	@Value("${cust.name}")
	String theName;
	
	public String getMessage() {
		return "Happy day "+theName+"!";
	}
	
}

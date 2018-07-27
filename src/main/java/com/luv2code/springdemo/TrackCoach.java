package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	@Autowired
	Fortune fortune;
	
	public String getDailyWork() {
		return "Run a 5 minute" +"\n" + this.fortune.getMessage();
	};

}

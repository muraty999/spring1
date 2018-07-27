package com.luv2code.springdemo.oldway;

import com.luv2code.springdemo.*;

public class WithoutSpring {

	public static void main(String[] args) {
		
		Coach coach = new TrackCoach();
		System.out.println(coach.getDailyWork());
		
	}

}

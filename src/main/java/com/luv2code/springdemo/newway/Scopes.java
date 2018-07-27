
package com.luv2code.springdemo.newway;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class Scopes {

	public static void main(String[] args)  {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach1 == theCoach2);
		
		System.out.println(theCoach1);
		System.out.println(theCoach2);
		
		// close the context
		context.close();
	}

}

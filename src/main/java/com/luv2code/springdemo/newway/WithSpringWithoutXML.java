
package com.luv2code.springdemo.newway;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.Coach;

public class WithSpringWithoutXML {

	public static void main(String[] args)  {
		
		// load the spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(MyConfiguration.class);
				
		// retrieve bean from spring container
		Coach theCoach = context.getBean("trackCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWork());
		
		// close the context
		context.close();
	}

}

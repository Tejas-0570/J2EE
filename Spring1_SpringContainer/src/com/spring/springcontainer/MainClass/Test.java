package com.spring.springcontainer.MainClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.springcontainer.Student;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/springcontainer/config/applicationContext.xml");
		
		Student s = (Student) context.getBean("student");
		
		s.display();
	}
}

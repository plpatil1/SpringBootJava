package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Human human = context.getBean("human",Human.class);
		Human human1 = context.getBean("human",Human.class);
		//human.pump();
		
		boolean status = (human==human1);
		System.out.println("Status = "+status);
		
		System.out.println("memory loation of human = "+human);
		System.out.println("memory loation of human1 = "+human1);
				
	}

}

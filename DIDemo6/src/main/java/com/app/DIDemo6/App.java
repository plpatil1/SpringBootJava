package com.app.DIDemo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	Human h = context.getBean("human",Human.class);
    	h.pump();
      
    }
}

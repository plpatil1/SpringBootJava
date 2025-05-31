package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
		/*
		 * Vodafone vodafone = new Vodafone();
		 *  vodafone.calling();
		 *   vodafone.data();
		 */
		
		/*
		 * Jio jio = new Jio();
		 *  jio.calling(); 
		 *  jio.data();
		 */
		
		/*
		 * Sim sim = new Jio(); 
		 * sim.calling(); 
		 * sim.data();
		 */
		
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 * Vodafone v =(Vodafone) context.getBean("voda");
		 *  v.calling(); 
		 *  v.data();
		 */
		
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 * Jio v =(Jio) context.getBean("jio");
		 *  v.calling(); 
		 *  v.data();
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Sim sim = context.getBean(Sim.class,"sim");
		sim.calling();
		sim.data();
	}


}

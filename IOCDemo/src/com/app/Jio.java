package com.app;

public class Jio implements Sim{
	
	public Jio()
	{
		System.out.println("Jio Constrcutor called");
	}
	
	@Override
	public void calling() {
		
		System.out.println("Calling using Jio Sim");
	}

	@Override
	public void data() {
		
		System.out.println("Browsing data using Jio SIm");
	}


}

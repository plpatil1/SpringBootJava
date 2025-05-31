package com.app;

public class Vodafone implements Sim{
	
	public Vodafone()
	{
		System.out.println("Vodafone Constrcutor called");
	}

	@Override
	public void calling() {
		
		System.out.println("Calling using Vodafone Sim");
	}

	@Override
	public void data() {
		
		System.out.println("Browsing data using Vodafone SIm");
	}

}

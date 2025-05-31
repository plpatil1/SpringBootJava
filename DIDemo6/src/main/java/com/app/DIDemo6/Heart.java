package com.app.DIDemo6;

public class Heart {

	private String nameOfAnimal;
	private int noOfHearts;

	public Heart() {
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHearts() {
		return noOfHearts;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

	public void pumping() {
		System.out.println("Your heart is pumping");
		System.out.println("You are Alive!!!");

	}

}

package edu.pitt.is17.xiy62.HelloAnimals;

public class Bird extends Animal{

	public Bird(String age, String color, int weight, int miniWeight) {
		super(age, color,"Bird", weight, miniWeight);
		
	}
	public int fly(){
		return getWeight()-2;
	}
}

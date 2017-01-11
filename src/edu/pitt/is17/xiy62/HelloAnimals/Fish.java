package edu.pitt.is17.xiy62.HelloAnimals;

public class Fish extends Animal {

	public Fish(String age, String color, int weight, int miniWeight) {
		super(age, color, "Fish", weight, miniWeight);
		
	}
	public int swim(){
		return getWeight()-1;
	}
}

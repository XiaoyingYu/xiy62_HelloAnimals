package edu.pitt.is17.xiy62.HelloAnimals;

public class Fish extends Animal {

	Fish(String age, String color, int weight, int miniWeight) {
		super(age, color, "Fish", weight, miniWeight);
		
	}
	int swim(){
		return getWeight()-1;
	}
}

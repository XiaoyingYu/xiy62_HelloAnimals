package edu.pitt.is17.xiy62.HelloAnimals;

public class Mammal extends Animal{

	public Mammal(String age, String color, int weight, int miniWeight) {
		super(age, color, "Mammal", weight, miniWeight);
		
	}
	public int run(){
		return getWeight()-1;
	}
}

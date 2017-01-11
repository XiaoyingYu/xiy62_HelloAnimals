package edu.pitt.is17.xiy62.HelloAnimals;

public class AnimalTest {
	public static void main(String[] args) {
		Fish fish1 = new Fish("2 years", "Grey", 57, 40);
		Fish fish2 = new Fish("2 years", "Grey", fish1.eat(), 40);
		Fish fish3 = new Fish("2 years", "Grey", fish2.swim(), 40);
		Bird bird1 = new Bird("1 years", "Brown", 25, 20);
		Bird bird2 = new Bird("1 years", "Brown", bird1.eat(), 20);
		Bird bird3 = new Bird("1 years", "Brown", bird2.fly(), 20);
		Mammal mammal1 = new Mammal("4 years", "Yellow", 420, 360);
		Mammal mammal2 = new Mammal("4 years", "Yellow", mammal1.eat(), 360);
		Mammal mammal3 = new Mammal("4 years", "Yellow", mammal2.run(), 360);
	
	
		
		fish3.output();
		bird3.output();
		mammal3.output();
	
	
	}
}
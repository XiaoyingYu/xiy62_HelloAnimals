package edu.pitt.is17.xiy62.HelloAnimals;

public class Animal {
	private String age;
	private String color;
	private String type;
	private int weight;
	private int miniWeight;

	public Animal(String age, String color, String type, int weight, int miniWeight){
		this.age=age;
		this.color=color;
		this.type=type;
		this.weight=weight;
		this.miniWeight=miniWeight;
	}

	public int eat(){
		return weight+1;
	}
	public void output(){
		if(weight>miniWeight){
			System.out.println("The weight of "+type+ " is: "+weight+"\n"+ "It is larger than a miniWeight:"+miniWeight);
		}
		if(weight<=miniWeight){
			System.out.println("The weight of "+type+ " is: "+weight+"\n"+ "It is not larger than a miniWeight:"+miniWeight);
		}
	}
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

}

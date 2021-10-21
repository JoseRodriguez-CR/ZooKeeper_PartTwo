package PartTwo;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("Throwing this thing to you, Uh Uh Uh Uh");
		energyLevel -= 5;
		//System.out.println(energyLevel);
		displayEnergy();
	}
	public void eatBanana() {
		System.out.println("I love bananas, yummy yummy!!");
		energyLevel += 10;
		//System.out.println(energyLevel);
		displayEnergy();
	}
	public void climb() {
		System.out.println("Uh Uh Uh Uh climbing tree");
		energyLevel -= 10;
		//System.out.println(energyLevel);
		displayEnergy();
	}
}
package PartTwo;


public class Bat extends Mammal{
	public Bat(int energyLevel) {
		super(300);
	}
	public void fly() {
		System.out.println("Hello there, I'm Dracula. I'm starving and looking for delicious humans!!");
		energyLevel -= 50;
		displayEnergy();
	}
	public void eatHumans() {
		System.out.println("Just catch one of the delicious ones, let eat this human, then I'll be eating you");
		energyLevel += 25;
		displayEnergy();
	}
	public void attackTown() {
		System.out.println("Run for your lifes while I'm attacking your town with fire");
		energyLevel -= 100;
		displayEnergy();
	}
	
	
}
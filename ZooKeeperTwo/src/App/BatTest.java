package App;
import PartTwo.Bat;


public class BatTest {  //Create a BatTest class to instantiate a bat 
	public static void main( String args[] ) {
		Bat Dracula = new Bat (300);
		
		//Have Dracula attacking three towns
		Dracula.attackTown();
		Dracula.attackTown();
		Dracula.attackTown();
		
		//Have Dracula eat two humans		
		Dracula.eatHumans();
		Dracula.eatHumans();
		
		//Have Dracula fly twice
		Dracula.fly();
		Dracula.fly();
	
	}

}
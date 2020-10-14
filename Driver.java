public class Driver {
	
	public static void main(String [] arg) {
		//Fish acctually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish(); //nemo adalah object ,Fish adalah kelas
		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red"); //change here
		nemo.Swim();


		//nemo.Eat(); //superclass call subclass method -not posibble


		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharkTeeth(130);
		fiery.Eat();


		// Fish dory = new Fish(); // another object
		// dory.Swim();
		// //dory.color = "red"; //tukar value
		// dory.SetColor("yellow"); // change here
		// dory.Swim();

		// Aquirium fancyAquirium = new Aquirium();
		// fancyAquirium.fillFish();
	}
}
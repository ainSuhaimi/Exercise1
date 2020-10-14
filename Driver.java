public class Driver {
	
	public static void main(String [] arg) {
		//Fish acctually is a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish(); //nemo adalah object ,Fish adalah kelas
		nemo.Swim();
		nemo.color = "red"; //tukar value
		nemo.Swim();

		Fish dory = new Fish(); // another object
		dory.Swim();
	}
}
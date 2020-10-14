public class Fish {
	
	//attribute or data member or field
	private String color = "blue";  //default value

    //Method
	public void Swim() {
		System.out.println(color + " fish swim");
	}

	//setter /mutator method
	public void SetColor(String warna) {
		color = warna;

	}
	
	//Getter / Accessor method
	public String GetColor() {
		return color;
	}
}
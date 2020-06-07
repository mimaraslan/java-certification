package _0010_4_object;

public class Chicken {

	// field - variable
	int numEggs = 12; // initialize on line
	
	// field - variable - object reference
	String name;

	public Chicken() {
		name = new String("Duke");
	//	name =            "Duke"; // initialize in constructor
	}
	
	public static void main(String[] args) {
		Chicken myObj = new Chicken();
		System.out.println(myObj.name);
	}

}
package _006_instanceof;

class HeavyAnimal { }
class Hippo extends HeavyAnimal { }
class Elephant extends HeavyAnimal { }

public class MainApp {

	public static void main(String[] args) {
		
		HeavyAnimal hippo = new Hippo();
		
		boolean b1 = hippo instanceof Hippo; 
		System.out.println(b1); // true
		
		boolean b2 = hippo instanceof HeavyAnimal; 
		System.out.println(b2); // true
		
		boolean b3 = hippo instanceof Elephant; 
		System.out.println(b3); // false
		
		boolean b4 = hippo instanceof Object; 
		System.out.println(b4); // true
 
		Hippo nullHippo = null;
		boolean b5 = nullHippo instanceof Object; 
		System.out.println(b5); // false
		
		Hippo anotherHippo = new Hippo();
		boolean b6 = anotherHippo instanceof Elephant; // DOES NOT COMPILE
	}
}
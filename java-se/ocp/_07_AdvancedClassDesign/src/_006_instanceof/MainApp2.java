package _006_instanceof;

class HeavyAnimal2 { }
class Hippo2 extends HeavyAnimal2 { }

interface Mother2 {}
class MotherHippo2 extends Hippo2 implements Mother2 { }

public class MainApp2 {

	public static void main(String[] args) {
		
		MotherHippo2 hippo = new MotherHippo2();
 
		boolean b1 = hippo instanceof Mother2; 
		System.out.println(b1); // true
		
	}
}
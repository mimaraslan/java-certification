package _0010_1_ordering_elements; // package must be first non-comment

import java.util.*; // import must come after package

public class MainApp1 { // then comes the class

	double weight = 12.3; // fields and methods can go in either order

	public double getWeight() {
		return weight;
	}

	double height; // another field - they don't need to be together

	public static void main(String[] args) {
		MainApp1 obj = new MainApp1();
		System.out.println(obj.getWeight());
	}
	
}
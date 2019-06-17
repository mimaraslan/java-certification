package _0013_redeclaring_private_methods;

public class Camel {
// It is not possible to override a private method in a parent class
// since the parent method is not accessible from the child class. 	
	private String getNumberOfHumps() {
		return "Parent";
	}
}
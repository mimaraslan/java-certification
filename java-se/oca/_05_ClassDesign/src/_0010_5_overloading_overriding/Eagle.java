package _0010_5_overloading_overriding;

public class Eagle extends Bird {
	
	public int fly(int height) { // Overloading
		System.out.println("Eagle is flying at " + height + " meters");
		return height;
	}

	public void eat(int food) { // Overriding
		System.out.println("Eagle is eating " + food + " units of food");
		//return food;
	}

	public static void main(String[] args) {
	    Bird obj  = new Eagle();
	  //Eagle obj = new Eagle();
	
		obj.fly();
		obj.eat(10);		
	}
}
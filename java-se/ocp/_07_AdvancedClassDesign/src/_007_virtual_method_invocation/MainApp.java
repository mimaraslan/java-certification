package _007_virtual_method_invocation;

abstract class Animal {
	String name = "???";
	public Animal() { System.out.println("Animal"); }
	public abstract void feed();
	
	public void printName() { System.out.println(name + "\n"); }
	
	public void careFor() { System.out.println("Animal careFor"); play();}
	public void play() { System.out.println("Animal play\n"); } 
}

class Cow extends Animal {
	String name = "MyCowName";
	public Cow() { System.out.println("Cow");}
	public void feed() { System.out.println("feed"); addHay(); }
	private void addHay() {	System.out.println("addHay\n"); }
	
	public void printName() { System.out.println(name + "\n"); }
	
	public void play() { System.out.println("Cow play\n"); } 

}

class Bird extends Animal {
	String name = "MyBirdName";
	public Bird() { System.out.println("Bird");}
	public void feed() { System.out.println("feed"); addSeed(); }
	private void addSeed() {  System.out.println("addSeed\n"); }
	
	public void printName() { System.out.println(name + "\n"); }
	
	public void play() { System.out.println("Bird play\n"); } 

}
	
class Lion extends Animal {
	String name = "MyLionName";
	public Lion() { System.out.println("Lion");}
	public void feed() { System.out.println("feed"); addMeat(); }
	private void addMeat() { System.out.println("addMeat\n");  }
	
	public void printName() { System.out.println(name + "\n"); }
	
	public void play() { System.out.println("Lion play\n"); } 
	
}

public class MainApp {

	public void feedAnimal(Animal animal) {
		 animal.feed();
	}
	
	public static void main(String... args) {
		Cow cow = new Cow();
		cow.feed();
		 
		Bird bird = new Bird();
		bird.feed();

		Lion lion = new Lion();
		lion.feed();	
		System.out.println("------------------------");

		MainApp obj = new MainApp(); 
		obj.feedAnimal(new Cow());
		obj.feedAnimal(new Bird());
		obj.feedAnimal(new Lion());	
		System.out.println("------------------------");
		
		Animal animal = new Cow();
		animal.printName();
		
		animal = new Bird();
		animal.printName();
		
		animal = new Lion();
		animal.printName();	
		System.out.println("------------------------");
		
		animal = new Lion();
		animal.careFor();
		
		animal = new Bird();
		animal.careFor();
		
		animal = new Lion();
		animal.careFor();	
		
	}
}
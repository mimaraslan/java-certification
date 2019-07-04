package _006_instanceof;

class Animal {
	public Animal() {
		System.out.println("Animal");
	}
}

class Cow extends Animal {
	public void addHay() {
		System.out.println("Cow addHay\n");
	}
}

class Bird extends Animal {
	public void addSeed() {
		System.out.println("Bird addSeed\n");
	}
}

class Lion extends Animal {
	public void addMeat() {
		System.out.println("Lion addMeat\n");
	}
}

public class MainApp3 {

	public void feedAnimal(Animal animal) {
		 if(animal instanceof Cow) {
			 ((Cow)animal).addHay();
		 } else if(animal instanceof Bird) {
			 ((Bird)animal).addSeed();
		 } else if(animal instanceof Lion) {
			 ((Lion)animal).addMeat();
		 } else {
			 throw new RuntimeException("Unsupported animal");
		 } 
	}
	
	public static void main(String[] args) {
		
		MainApp3 obj = new MainApp3(); 
		obj.feedAnimal(new Cow());
		obj.feedAnimal(new Bird());
		obj.feedAnimal(new Lion());
	}
}
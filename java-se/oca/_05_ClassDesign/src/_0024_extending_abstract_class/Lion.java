package _0024_extending_abstract_class;

public class Lion extends BigCat {
	
	public String getName() {
		return "Lion";
	}

	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		System.out.println(lion.getName()); // Lion
		lion.roar(); // The Lion lets out a loud ROAR!

	}
}
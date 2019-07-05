package _017_casting_object_references;

public class Fish {

	public Fish() {
		System.out.println("Fish");
	}

	public static void main(String[] args) {
		Fish fish = new Fish();
		Bird bird = (Fish) bird; // DOES NOT COMPILE -  Fish and Bird are not related through any class hierarchy
	}
}
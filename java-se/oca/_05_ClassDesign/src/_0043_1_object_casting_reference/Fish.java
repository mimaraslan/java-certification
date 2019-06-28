package _0043_1_object_casting_reference;

public class Fish {
	public static void main(String[] args) {
		Fish fish = new Fish();
		Bird bird = (Bird) fish; // DOES NOT COMPILE
	}
}
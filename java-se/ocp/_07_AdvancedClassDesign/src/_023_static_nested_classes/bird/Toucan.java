package _023_static_nested_classes.bird;

public class Toucan {

	public Toucan() {
		System.out.println("Toucan");
	}

	public static class Beak {
		public Beak() {
			System.out.println("Beak");
		}
	}
}
package _007_generic;

public class Elephant {
	public static void main(String[] args) {

		Elephant elephant = new Elephant();
		Integer numPounds = 15_000;
		SizeLimitedCrate<Elephant, Integer> obj = new SizeLimitedCrate<>(elephant, numPounds);
		System.out.println(obj);
	}
}
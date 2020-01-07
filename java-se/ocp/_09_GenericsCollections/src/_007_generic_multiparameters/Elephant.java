package _007_generic_multiparameters;

public class Elephant {
	public static void main(String[] args) {

		Integer weight = 11_000;
		Elephant elephant = new Elephant();
		
		Create<Elephant, Integer> obj = new Create<>(elephant, weight);
		System.out.println(obj);
	}
}
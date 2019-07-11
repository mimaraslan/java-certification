package _006_generic;

public class Elephant {
	public static void main(String[] args) {

		Crate<Elephant> crateForElephant = new Crate<>();

		Elephant elephant = new Elephant();
		crateForElephant.packCrate(elephant);
		Elephant inNewHome = crateForElephant.emptyCrate();

	}
}

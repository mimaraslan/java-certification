package _006_generic;

public class Zebra {
	public static void main(String[] args) {

		Crate<Zebra> crateForZebra = new Crate<>();
		
		Zebra zebra = new Zebra();
		crateForZebra.packCrate(zebra);
		Zebra inNewHome = crateForZebra.emptyCrate();

	}
}

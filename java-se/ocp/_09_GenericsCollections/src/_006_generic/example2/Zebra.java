package _006_generic.example2;

public class Zebra {
	public static void main(String[] args) {

		Crate<Zebra> crateForZebra = new Crate<>();
		
		Zebra zebra = new Zebra();
		crateForZebra.packCrate(zebra);
		Zebra inNewHome = crateForZebra.emptyCrate();
		System.out.println(inNewHome);
	}
}

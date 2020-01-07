package _006_generic.example2;

public class Zebra {
	public static void main(String[] args) {

		Create<Zebra> create = new Create<>();
		
		Zebra zebra1 = new Zebra();
		create.oneCreate(zebra1);
		System.out.println(zebra1);
			
		Zebra zebra2 = create.getInformation();
		System.out.println(zebra2);
	}
}

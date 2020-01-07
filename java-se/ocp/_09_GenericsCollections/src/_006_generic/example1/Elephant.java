package _006_generic.example1;

public class Elephant {
	public static void main(String[] args) {

		Create<Elephant> create = new Create<>();
		
		Elephant elephant1 = new Elephant();
		create.oneCreate(elephant1);
		System.out.println(elephant1);

		Elephant elephant2 = create.getInformation();
		System.out.println(elephant2);
	}
}
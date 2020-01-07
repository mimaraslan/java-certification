package _006_generic.example1;

public class Elephant {
	public static void main(String[] args) {

		Animal<Elephant> animal = new Animal<>();
		
		Elephant elephant1 = new Elephant();
		animal.oneCreate(elephant1);
		System.out.println(elephant1);

		Elephant elephant2 = animal.getCreate();
		System.out.println(elephant2);
	}
}
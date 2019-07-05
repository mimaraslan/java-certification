package _011_predicate_interface;

public class FindMatchingAnimals {
	
	private static void print(Animal animal, Predicate<Animal> trait) {
		if (trait.test(animal))
			System.out.println(animal);
	}

	public static void main(String[] args) {
		print(new Animal("lion", true, true)     ,(a) ->  { return a.canHop(); }  );
		print(new Animal("fish", true, true)     , a  ->  { return a.canHop(); }  );
		print(new Animal("cat", true, false)	 , a  ->           a.canHop()     );
		print(new Animal("kangaroo", true, false), a  ->           a.canHop()     );
	}
	
}
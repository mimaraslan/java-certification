package _006_generic.example1;

/*
 Naming Conventions for Generics
 
 E for an element
 K for a map key
 V for a map value
 N for a number
 T for a generic data type
 S, U, V, and so forth for multiple generic types
 
 */
public class Create<T> {
	
	private T contents;

	public T getInformation() {
		return contents;
	}

	public void oneCreate(T contents) {
		this.contents = contents;
	}
}
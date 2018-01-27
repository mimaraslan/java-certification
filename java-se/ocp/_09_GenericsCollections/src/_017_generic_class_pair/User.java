package _017_generic_class_pair;

//It demonstrates the usage of generics in defining classes
public class User<T1, T2> {
	T1 object1;
	T2 object2;

	User(T1 age, T2 firstname) {
		object1 = age;
		object2 = firstname;
	}

	public T1 getPersonAge () {
		return object1;
	}

	public T2 getPersonName() {
		return object2;
	}
}
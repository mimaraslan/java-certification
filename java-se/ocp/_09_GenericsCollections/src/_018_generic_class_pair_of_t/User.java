package _018_generic_class_pair_of_t;

public class User<T> {
	T object1;
	T object2;

	User(T age, T firstname) {
		object1 = age;
		object2 = firstname;
	}

	public T getPersonAge () {
		return object1;
	}

	public T getPersonName() {
		return object2;
	}
}
package _003_abstract_classes;

public class Lion extends Cat {
	
	void clean1() {
		System.out.println("clean1");
	}

	void clean2() {
		System.out.println("clean2");
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.clean1();
		lion.clean2();
	}
}
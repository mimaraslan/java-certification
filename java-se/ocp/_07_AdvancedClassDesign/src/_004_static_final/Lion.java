package _004_static_final;

public class Lion extends Cat {
	
	void clean1() {
		System.out.println("subclass clean1");
	}
	
	static void clean2() {
		System.out.println("subclass clean2");
	}
	
	void clean3() {
		System.out.println("subclass clean3");
	}
	
	void clean4() {
		System.out.println("subclass clean4");
	}

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.clean1();
		lion.clean2();
		lion.clean3();
		lion.clean4();
	}
}
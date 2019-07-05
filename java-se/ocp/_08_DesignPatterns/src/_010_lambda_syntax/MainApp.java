package _010_lambda_syntax;

public class MainApp {
	
	public static void main(String[] args) {
		
		() -> new Duck()
		d -> {return d.quack();}
		(Duck d) -> d.quack()
		(Animal a, Duck d) -> d.quack()
		
		Duck d -> d.quack() // DOES NOT COMPILE
		a,d -> d.quack() // DOES NOT COMPILE
		Animal a, Duck d -> d.quack() // DOES NOT COMPILE
		
		() -> true // 0 parameters
		a -> {return a.startsWith("test");} // 1 parameter
		(String a) -> a.startsWith("test") // 1 parameter
		(int x) -> {} // 1 parameter
		(int y) -> {return;} // 1 parameter
		(a, b) -> a.startsWith("test") // 2 parameters
		(String a, String b) -> a.startsWith("test") // 2 parameters
		
		a, b -> a.startsWith("test") // DOES NOT COMPILE
		c -> return 10; // DOES NOT COMPILE
		a -> { return a.startsWith("test") } // DOES NOT COMPILE
		
		(a, b) -> a.startsWith("test")
		c -> { return 10; }
		a -> { return a.startsWith("test"); }
		
		(int y, z) -> {int x=1; return y+10; } // DOES NOT COMPILE
		(String s, z) -> { return s.length()+z; } // DOES NOT COMPILE
		(a, Animal b, c) -> a.getName() // DOES NOT COMPILE
		
		(y, z) -> {int x=1; return y+10; }
		(String s, int z) -> { return s.length()+z; }
		(a, b, c) -> a.getName()
		
		(a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE
		(a, b) -> { int c = 0; return 5;}

	}
}

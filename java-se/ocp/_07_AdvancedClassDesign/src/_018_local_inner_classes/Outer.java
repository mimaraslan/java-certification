package _018_local_inner_classes;

public class Outer {
	private int length = 5;

	public void calculate() {
		final int width = 20;

		class Inner {
			public void multiply() {
				System.out.println(length * width);
			}
		}

		Inner inner = new Inner();
		inner.multiply();
	}

	public void isItFinal() {
		int one = 20;
		int two = one;
		two++;
		int three;
		if (one == 4)
			three = 3;
		else
			three = 4;
		int four = 4;

		System.out.println("one  : " + one);
		System.out.println("two  : " + two);
		System.out.println("three: " + three);
		System.out.println("four : " + four);

		class Inner {
			public Inner() {
				System.out.println("isItFinal - Inner class");
			}
		}
		four = 5;
		System.out.println("four : " + four);
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.calculate(); // 100
		outer.isItFinal(); 
	}
}
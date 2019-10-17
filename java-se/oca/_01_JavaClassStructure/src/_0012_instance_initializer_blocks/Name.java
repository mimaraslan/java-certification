package _0012_instance_initializer_blocks;

public class Name {

	String first = "Theodore";
	String last = "Moose";
	String full = first + last;

	public static void main(String[] args) {
		
		
		System.out.println("1");

		{
			System.out.println("2");
		}
		
		System.out.println("3");

		Name nameObj = new Name();

	}

	{
		System.out.println("4");
	}
}
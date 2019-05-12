package _0012_instance_initializer_blocks;

public class Name {
	String first = "Theodore";
	String last = "Moose";
	String full = first + last;

	public static void main(String[] args) {
		{
			System.out.println("Feathers");
		}
	}

	{
		System.out.println("Snowy");
	}
}
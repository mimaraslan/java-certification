package _0032_final_fields;

public class MouseHouse {
	private final int volume;
	private final String name = "The Mouse House";

	public MouseHouse(int length, int width, int height) {
		volume = length * width * height;
	}
	
	public static void main(String[] args) {
		MouseHouse obj = new MouseHouse(1, 2, 3);
		System.out.println(obj.volume);
	}
}
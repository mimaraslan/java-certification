package _001_designing_interface;

public class Eagle implements Fly {

	@Override
	public int getWingSpan() {
		System.out.println("Eagle getWingSpan");
		return 15;
	}

	@Override
	public void land() {
		System.out.println("Eagle is diving fast");
	}

	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		eagle.getWingSpan();
		eagle.land();
		
		System.out.println(Fly.MAX_SPEED);
		System.out.println(Fly.calculateSpeed(107, 20)); // 5.35
	}
}
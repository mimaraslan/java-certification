package _002_designing_interface;

public class Lion implements Run {
	
	@Override
	public boolean isQuadruped() {
		return true;
	}

	@Override
	public boolean canHuntWhileRunning() {
		return true;
	}

	@Override
	public double getMaxSpeed() {
		return 100;
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		System.out.println("isQuadruped: " + lion.isQuadruped());
		System.out.println("canHuntWhileRunning: " + lion.canHuntWhileRunning());
		System.out.println("getMaxSpeed: " + lion.getMaxSpeed());
	}
}
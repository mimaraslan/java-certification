package _002_designing_interface;

public interface Run extends Walk {
	public abstract boolean canHuntWhileRunning();
	abstract double getMaxSpeed();
}
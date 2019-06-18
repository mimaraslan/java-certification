package _0037_default_methods_multiple_inheritance;

public interface Walk {
	public default int getSpeed() {
		return 5;
	}
	
	void lolo();
}
package _0038_default_methods_multiple_inheritance;

public interface Walk {
	public default int getSpeed() {
		return 2;
	}
}
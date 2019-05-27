package _0001_access_modifiers;

public class MainApp {
	public void walk1() {}
	default void walk2() {} // DOES NOT COMPILE
	void public walk3() {} // DOES NOT COMPILE
	void walk4() {}
}

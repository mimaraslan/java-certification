package _0002_optional_specifiers;

public class MainApp {

	private static final void myMethod1() {}
	private final static void myMethod2() {}
	static private final void myMethod3() {}
	static final private void myMethod4() {}
	final static private void myMethod5() {}
	final private static void myMethod6() {}

	protected static final void myMethod7() {}
	protected final static void myMethod8() {}
	static protected final void myMethod9() {}
	static final protected void myMethod10() {}
	final static protected void myMethod11() {}
	final protected static void myMethod12() {}
	
	//Default Access
	static final void myMethod13() {}
	final static void myMethod14() {}
	static final void myMethod15() {}
	static final void myMethod16() {}
	final static void myMethod17() {}
	final static void myMethod18() {}
	
	public static final void myMethod19() {}
	public final static void myMethod20() {}
	static public final void myMethod21() {}
	static final public void myMethod22() {}
	final static public void myMethod23() {}
	final public static void myMethod24() {}

	public default void walk5() {} // DOES NOT COMPILE
	public modifier void walk5() {} // DOES NOT COMPILE
	public void final walk6() {} // DOES NOT COMPILE
	
}

package _016_generic_class;

public class BoxPrinterTest {
	public static void main(String[] args) {
		
		BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new Integer(11));
		System.out.println(value1);
		
		BoxPrinter<Integer> value2 = new BoxPrinter<Integer>(22);
		System.out.println(value2);
		
		BoxPrinter<String> value3 = new BoxPrinter<String>("Hello world");
		System.out.println(value3);
	}
}

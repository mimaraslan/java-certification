package _0010_throwing_a_second_exception;

public class MainApp2 {

	public String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before "; System.out.println(result);
				v.length();
				result += "after "; System.out.println(result);
			} catch (NullPointerException e) {
				result += "catch "; System.out.println(result);
				throw new RuntimeException();
			} finally {
				result += "finally "; System.out.println(result);
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done "; System.out.println(result);
		}
		
		return result;
	}

	public static void main(String[] args) throws Exception {
		MainApp2 obj = new MainApp2();
		obj.exceptions();
	}
}
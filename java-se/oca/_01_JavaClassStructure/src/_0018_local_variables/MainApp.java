package _0018_local_variables;

public class MainApp {

	public int notValid() {
		int y = 10;
		int x; 	//Local variables must be initialized before use. 
		int reply = x + y; // DOES NOT COMPILE 
		return reply;
	}
	
	public static void main(String[] args) {
	
	}
}
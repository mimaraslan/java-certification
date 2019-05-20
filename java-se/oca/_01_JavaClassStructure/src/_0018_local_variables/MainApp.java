package _0018_local_variables;

public class MainApp {

	public int notValid() {
		int y = 10;
		int x; 	//Local variables must be initialized before use. 
		int reply = x + y; // DOES NOT COMPILE 
		return reply;
	}
	
	public int valid() {
		int y = 10;
		int x; // x is declared here
		x = 3; // and initialized here 
		int reply = x + y;
		return reply;
	}

	public void findAnswer(boolean check) { 
		int answer;
		int onlyOneBranch;
		
		if (check) {
			onlyOneBranch = 1;
			answer = 1; 
		} else {
			answer = 2;
		}
		
		System.out.println(answer);
		System.out.println(onlyOneBranch); // DOES NOT COMPILE 
	}
	
	public static void main(String[] args) {
	
	}
}
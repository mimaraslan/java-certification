package _0020_continue_statement;

public class SwitchSample {
	public static void main(String[] args) {
		
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			
			for (char x = 'a'; x <= 'c'; x++) {
				
				if (a == 2 || x == 'b') {
					continue FIRST_CHAR_LOOP;
				}
				
				System.out.print(" " + a + x);
			}
			
		}
	
	}
}

package _0012_switch_statement;

public class MainApp3 {

	public static void main(String[] args) {
		MainApp3 obj = new MainApp3();
		obj.getSortOrder("Murat", "Aslan");
	}

	private int getSortOrder(String firstName, final String lastName) {
		
		int id = 0;
		final String suffix = "MR";
		String middleName = "Murat";

		switch (firstName) {  
			case "Test": 
				return 52;
			case middleName: //is not a final variable //DOES NOT COMPILE 
				id = 5;
				break;
			case suffix: 
				id = 0;
				break;
			case lastName:  //it is not constant as it is passed to the function //DOES NOT COMPILE 
				id = 8;
				break;
			case 5: // DOES NOT COMPILE
				id = 7;
				break;
			case 'J': // DOES NOT COMPILE
				id = 10;
				break;
			case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
				id = 15;
				break;
			}
		
		return id;
	}
}
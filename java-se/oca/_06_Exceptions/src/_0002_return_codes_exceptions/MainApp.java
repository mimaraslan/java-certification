package _0002_return_codes_exceptions;

public class MainApp {	
	
	public int indexOf(String[] names, String name) {
		 
		for (int i = 0; i < names.length; i++) {
			 if (names[i].equals(name)) { 
				 System.out.println(names[i]);
				 	return i;
				 }
		 	}
		 		 
		 return -1;
	}
	
	public static void main(String[] args) {
		
		MainApp mainApp = new MainApp();
		
		String[] names = {"Katerina", "Anna", "", " ", null ,"Sveta", "Lena"};
		String name = "Lena";
				
		mainApp.indexOf(names, name);
	}	
}
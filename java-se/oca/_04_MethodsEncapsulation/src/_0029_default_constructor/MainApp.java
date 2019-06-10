package _0029_default_constructor;

public class MainApp {
	
//Constructor metodun adı sınıfın adıyla aynı olmalı
//public mainApp() { }     // DOES NOT COMPILE - Java is case sensitive				

//Constructor metodun önünde 
//erişim belirteçleri (private, protected, public) kullanabilirsiniz
//		private   MainApp() {  System.out.println("constructor private");  } // OK
//		protected MainApp() {  System.out.println("constructor protected");} // OK
//		 		  MainApp() {  System.out.println("constructor default");  } // OK
		public    MainApp() {  System.out.println("constructor public");   } // OK

		public    MainApp(int a) {  System.out.println("constructor 1 param int");   } // OK
		public    MainApp(boolean a) {  System.out.println("constructor 1 param boolean");   } // OK
		public    MainApp(float a) {  System.out.println("constructor 1 param float");   } // OK
		public    MainApp(long a) {  System.out.println("constructor 1 param long");   } // OK
		public    MainApp(String a) {  System.out.println("constructor 1 param String");   } // OK
		public    MainApp(double a) {  System.out.println("constructor 1 param double");   } // OK

		
		public    MainApp(short a, short b) {  System.out.println("constructor 2 param short");   } // OK
		public    MainApp(int a, int b) {  System.out.println("constructor 2 param int int");   } // OK
		public    MainApp(long a, long b) {  System.out.println("constructor 2 param long");   } // OK
		
		
		
//Constructor metodun asla geri dönüş tipi yoktur! 
//Eğer varsa o sıradan bir metot olur	
//	public void MainApp() { System.out.println("a method "); } // This is a not constructor. This is a method.
//	public int MainApp() { return 1; }
//	public float MainApp() { return 1.0; }
//	public Long MainApp() {  return 1L; }
//	public String MainApp() {  return "Lolo"; }
	
	
	public static void main(String[] args) {
		MainApp obj = new MainApp(); // Calls default constructor
//		obj = new MainApp(1); 
//		obj = new MainApp("Lolo"); 
//		obj = new MainApp(1l); 
//		obj = new MainApp(1_000_000f); 
//		obj = new MainApp(1_000_000d); 
		
		obj = new MainApp(  (short) 1, (short) 300 ); 
		obj = new MainApp(   1, (short) 300 ); 


	}
}


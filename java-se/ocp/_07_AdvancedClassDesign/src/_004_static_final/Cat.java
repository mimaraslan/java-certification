package _004_static_final;

public abstract class Cat {
	
	 			  String name1 = "Katerina";
	 static 	  String name2 = "Yulya";
	 		final String name3 = "Rita";
	 static final String name4 = "Anna";

	 			  void clean1() { System.out.println("clean1: " + name1);}
	 static 	  void clean2() { System.out.println("static clean2: " + name2);}
	 		final void clean3() { System.out.println("final clean3: " + name3);}
	 static final void clean4() { System.out.println("static final clean4: " + name4);}
	 


}
package _0033_order_initialization;

 public class YetMoreInitializationOrder {
	 
	 static { add(1); }
	 
	 static void add(int num) { System.out.print(num + " "); }
	 
	 YetMoreInitializationOrder() { add(5); }
	 
	 static { add(2); }
	 
	 { add(3); }
	 
	 static { new YetMoreInitializationOrder(); }
	 
	 { add(4); }
	 
	 public static void main(String[] args) { add(6); } 
 }
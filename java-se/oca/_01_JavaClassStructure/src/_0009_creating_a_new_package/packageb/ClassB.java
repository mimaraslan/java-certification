package _0009_creating_a_new_package.packageb;

import _0009_creating_a_new_package.packagea.ClassA;

public class ClassB {
	public static void main(String[] args) {
		
		ClassA aObj = new ClassA();
		System.out.println("Class A object1: " + aObj);
		System.out.println("Class A object1 hashCode: " + aObj.hashCode());

		
		System.out.println("Class A object2: " + new ClassA());
		
	}
}


/*

-d <dir>
-cp <classpath>
-classpath <classpath>
--class-path <classpath>

 
javac -d classes packagea/ClassA.java packageb/ClassB.java
 
java -cp classes packageb.ClassB
java -classpath classes packageb.ClassB
java --class-path classes packageb.ClassB

//----------------------------------------------------- 
 
// This path is for MAC. 
cd /Users/YOUR_PC_NAME/Documents/workspace/java-certification/java-se/oca/
ls

cd _01_JavaClassStructure/target/classes/_0009_creating_a_new_package/
ls

cd packagea
ls
cd ..

cd packagea
ls 
 
 */
 
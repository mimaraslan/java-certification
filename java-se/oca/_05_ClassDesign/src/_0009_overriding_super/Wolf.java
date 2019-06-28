package _0009_overriding_super;

public class Wolf extends Canine {
	
	public double getAverageWeight() {
		return super.getAverageWeight() + 20;
	}

	public static void main(String[] args) {		
		System.out.println(new Canine().getAverageWeight()); // 50.0
		System.out.println(new Wolf().getAverageWeight()); 	 // 70.0
	}
}

package _010_equals;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Lion {

	private int idNumber;
	private int age;
	private String name;

	public Lion(int idNumber, int age, String name) {
		this.idNumber = idNumber;
		this.age = age;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (!(obj instanceof Lion))
			return false;
		
//		if (obj == null)
//		return false;
		
//		Lion otherLion = (Lion) obj;
//		return this.idNumber == otherLion.idNumber 
//				&& this.age == otherLion.age 
//				&& this.name == otherLion.name;
		
		return EqualsBuilder.reflectionEquals(this, obj);
	}
	
	public static void main(String[] args) {
		Lion lion1 = new Lion(1, 30, "Katerina");
		Lion lion2 = new Lion(1, 30, "Katerina");
		Lion lion3 = new Lion(1, 30, "Lena");

		System.out.println("card1.equals(card2) : " + lion1.equals(lion2));
		System.out.println("card1.equals(card3) : " + lion1.equals(lion3));
	}
}
package _009_toString;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Hippo {
	private String name;
	private double weight;

	public Hippo(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public String toString() {
		
		// Katerina
		//return name;
		
		// Name: Katerina, Weight: 69.0
		return "Name: " + name + ", Weight: " + weight;
		
		
		// http://commons.apache.org/proper/commons-lang
		
		// _009_toString.Hippo@7ea987ac[name=Katerina,weight=69.0]
		//return ToStringBuilder.reflectionToString(this);
		
		// Hippo[name=Katerina,weight=69.0]
		//return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);

		//{"name":"Katerina","weight":69.0}
		//return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);

	}

	public static void main(String[] args) {
		Hippo h1 = new Hippo("Katerina", 69);
		System.out.println(h1); // Name: Katerina, Weight: 69.0
	}
}
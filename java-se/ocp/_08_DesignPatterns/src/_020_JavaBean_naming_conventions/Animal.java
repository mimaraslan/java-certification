package _020_JavaBean_naming_conventions;

public class Animal {

	
	private int age; // Properties are private. 
	
	public int getAge() { return age; } // Getter for non‐boolean properties begins with get.
	
	
	private boolean playing;
	private Boolean dancing;
	
	
	// Getters for boolean properties may begin with is or get.	
	public boolean isPlaying() { return playing; } // is OK
	public boolean getPlaying() { return playing; } // get OK
	public void setPlaying(boolean playing) { this.playing = playing; }

	public Boolean isDancing() { return dancing; } // Incorrect Boolean wrapper should start with get
	public Boolean getDancing() { return dancing; } // get OK
	public void setDancing(Boolean dancing) { this.dancing = dancing; }
	
	
//	public String name;
//	public String name() { return name; }
//	public void updateName(String n) { name = n; }
//	public void setname(String n) { name = n; }
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		System.out.println(animal.isPlaying());
		System.out.println(animal.getPlaying());
		System.out.println(animal.isDancing());
		System.out.println(animal.getDancing());

		
	}



}

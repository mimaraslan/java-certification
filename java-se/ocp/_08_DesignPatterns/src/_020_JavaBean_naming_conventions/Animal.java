package _020_JavaBean_naming_conventions;

public class Animal {
	
	private boolean playing;
	private Boolean dancing;
	
	// Getters for boolean properties may begin with is or get.	
	public boolean isPlaying() { return playing; } // is OK for boolean
	public boolean getPlaying() { return playing; } // get OK for boolean
	public void setPlaying(boolean playing) { this.playing = playing; }

	public Boolean isDancing() { return dancing; } // Incorrect Boolean wrapper should start with get
	public Boolean getDancing() { return dancing; } // get OK for Boolean
	public void setDancing(Boolean dancing) { this.dancing = dancing; }
	
	public String name; //  should be private 
	public String name() { return name; } // should be getName()
	public void updateName(String n) { name = n; } // getter and should be getName()
	public void setname(String n) { name = n; } // getter and should be getName()
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		System.out.println("boolean is  : " + animal.isPlaying());
		System.out.println("boolean get : " + animal.getPlaying());
		System.out.println("boolean is  : " + animal.isDancing());
		System.out.println("boolean get : " + animal.getDancing());	
	}
}
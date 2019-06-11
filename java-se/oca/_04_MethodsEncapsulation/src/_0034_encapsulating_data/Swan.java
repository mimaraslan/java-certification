package _0034_encapsulating_data;

public class Swan {
	
	private int numberEggs; // private

	public int getNumberEggs() { // getter
		return numberEggs;
	}

	public void setNumberEggs(int numberEggs) { // setter
		if (numberEggs >= 0) // guard condition
			this.numberEggs = numberEggs;
	}
	
	 private boolean playing;
	 public boolean isPlaying() { return playing; } //  JavaBeans naming conventions
	 public boolean getPlaying() { return playing; }
	 
	 private String name;
	 public String name() { return name; }
	 public void updateName(String n) { name = n; }
	 public void setname(String n) { name = n; }
	
}
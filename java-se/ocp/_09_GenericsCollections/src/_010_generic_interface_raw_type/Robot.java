package _010_generic_interface_raw_type;

public class Robot {

	private String name;
	private int no;

	public Robot(String name, int no) {
		this.name = name;
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Robot [name=" + name + ", no=" + no + "]";
	}
}
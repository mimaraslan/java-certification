package _0035_immutable_classes;

public class NotImmutable {

	private StringBuilder builder;

	public NotImmutable(StringBuilder b) {
		builder = b;
	}

	public StringBuilder getBuilder() {
		return builder;
	}
	
	

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("one");
		NotImmutable problem = new NotImmutable(sb);
		sb.append(" two");
		
		StringBuilder gotBuilder = problem.getBuilder();
		gotBuilder.append(" three");
		
		System.out.println(problem.getBuilder());
	}
}
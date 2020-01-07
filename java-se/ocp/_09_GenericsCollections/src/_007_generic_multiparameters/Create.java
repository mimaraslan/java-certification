package _007_generic_multiparameters;

public class Create<T, U> {
	
	private T content;
	private U weight;

	public Create(T content, U weight) {
		this.content = content;
		this.weight = weight;
	}
}
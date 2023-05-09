package day15.quiz;

public class Container<T> {
	public T kind;
	
	public Container(T kind) {
		this.kind = kind;
	}

	public T get() {
		return kind;
	}

	public void set(T kind) {
		this.kind = kind;
	}
	

}

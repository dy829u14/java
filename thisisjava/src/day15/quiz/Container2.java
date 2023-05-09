package day15.quiz;

public class Container2<K,M> {
	public K key;
	public M value;
	
	public Container2(K key, M value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public M getValue() {
		return value;
	}

	public void setValue(M value) {
		this.value = value;
	}
	

	
}

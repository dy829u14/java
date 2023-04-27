package day08.exam02;

public class Cat extends Animal {
	String name;
	int age;
	
	public Cat(String name, int age) {
		//super();이 생략되어있는 상태
		this.name = name;
		this.age = age;
		this.kind = "고양이";
	}

	@Override
	public void sound() {
		super.sound();
		System.out.println("냐옹냐옹");
	}

	
	

}

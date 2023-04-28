package day08.exam02;

public class Flower {
	String name;
	int cost;
	
	public Flower(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	
	public void flowerInformation() {
		System.out.println(name+"1송이의 가격은 "+cost+"입니다");
	}
	public void overMethod() {
		System.out.println("부모의 메소드 입니다");
	}
}

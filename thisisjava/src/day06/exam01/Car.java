package day06.exam01;
//라이브러리 클래스(객체의 설계도)
public class Car {
	//필드선언
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxspeed;

	//생성자 선언 기본 생성자
	//생성자 오버로딩 : 매개 변수의 타입, 개수, 순서가 다른 생성자를 여러개 작성
	//목적 : 객체의 필드를 다양하게 초기화 할수있음
	public Car() {      // 1번 생성자
		
	}
	public Car(String model) {      //2번 생성자
		this(model,"흰색");  // 3번 생성자 호출
	}
	public Car(String model, String color) { //3번 생성자
		this(model,color,200); //4번 생성자 호출
	}
	//생성자 선언
	public Car(String model, String color, int maxspeed) {
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}

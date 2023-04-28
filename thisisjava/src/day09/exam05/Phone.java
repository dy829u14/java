package day09.exam05;

//추상 클래스
public abstract class Phone {
	//추상메소드는 추상클래스에서만 사용 가능
	//필드 선언
	String owner;
	
	//생성자 선언
	Phone(String owner) {
		this.owner = owner;
	}
	//메소드 선언
	void turnOn() {
		System.out.println("폰 전원을 킵니다");
	}
	void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	//추상 메소드
	abstract void send(String message); //실행블럭이 없음
}

package day07.exam01;

public class Car {
	//인스턴스 필드 선언
	int speed;
	//인스턴스 메소드 선언
	void run() {
		System.out.println(speed + "로 달립니다.");
	} 
	//정적 메소드 선언
	static void simulate() {
		//객체 생성
		Car car1 = new Car();
		car1.speed = 200;
		car1.run();
	}
	public static void main(String[] args) {
		simulate();
		Math.random();
	}
}

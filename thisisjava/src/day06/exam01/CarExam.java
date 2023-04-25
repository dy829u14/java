package day06.exam01;
//실행 클래스
public class CarExam {
	//main 메소드
	public static void main(String[] args) {
		//Car 객체 생성		
		Car car1 = new Car();
		//car1 객체의 필드 출력 하기 model, speed, start
		
		Car car2 = new Car("소나타");
		System.out.println("car2.company"+car2.company);
		System.out.println("car2.model"+car2.model);
		System.out.println();
		
		Car car3 = new Car("그랜저","빨강");
		System.out.println("car3.company"+car3.company);
		System.out.println("car3.model"+car3.model);
		System.out.println("car3.color"+car3.color);
		System.out.println();
		
		Car car4 = new Car("아반떼","흰색",200);
		System.out.println("car4.company"+car4.company);
		System.out.println("car4.model"+car4.model);
		System.out.println("car4.color"+car4.color);
		System.out.println("car4.maxspeed"+car4.maxspeed);
		System.out.println();

	}
}

package day06.exam02;

public class CarExam {

	public static void main(String[] args) {
		
		//객체 생성
		Car myCar = new Car();
		
		//gas필드값을 10으로 변경
		myCar.setGas(10);
		
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다");
			myCar.run();
		}
		System.out.println("gas를 주입해주세요");

	}

}

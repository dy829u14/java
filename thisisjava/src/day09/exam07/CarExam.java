package day09.exam07;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<15; i++) {
			//문제없으면 0, 앞왼쪽 펑크 1, 앞오른쪽 펑크 2,
			//뒤왼쪽 펑크 3, 뒤오른쪽 펑크 4
			int problemLcation = car.run();
			switch(problemLcation) {
			case 1:
				System.out.println("앞왼쪽 한국 타이어 교체");
				car.flTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 금호 타이어 교체");
				car.frTire = new KumhoTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 금호 타이어 교체");
				car.blTire = new KumhoTire("뒤왼쪽", 13);
				break;
			case 4:
				System.out.println("뒤오른쪽 한국 타이어 교체");
				car.brTire = new HankookTire("뒤오른쪽", 15);
				break;
				
			}
			System.out.println("------------------------------------");
		}

	}

}

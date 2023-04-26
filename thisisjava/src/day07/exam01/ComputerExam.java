package day07.exam01;

public class ComputerExam {

	public static void main(String[] args) {
		//Computer 객체생성
		Computer myCom = new Computer();
		//sum() 메소드 호출시 합산결과를 리턴받아서 result에 할당
		int result1 = myCom.sum(1,2,3);
		int result2 = myCom.sum(1,2,3,4,5,6);
		int[] nums = {1,2,3,4,5};
		int result3 = myCom.sum(nums);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		int result4 = myCom.add(2, 10);
		System.out.println(result4);
		
		double result5 = myCom.add(2.56, 3.45);
		System.out.println(result5);
		
		double result6 = myCom.areaRectangle(10.5);
		double result7 = myCom.areaRectangle(10.5, 3.5);
		System.out.println(result6);
		System.out.println(result7);
		
	}

}

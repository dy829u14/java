package day02.exam01;

public class OperatorExam02 {

	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;  //7
		int result2 = v1 - v2;  //3
		int result3 = v1 * v2;  //10
		int result4 = v1 / v2;  //2
		int result5 = v1 % v2;  //1
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		if(7%2==1) {
			System.out.println("홀수입니다.");
		} else {
			System.out.println("짝수입니다.");
		}

	}

}

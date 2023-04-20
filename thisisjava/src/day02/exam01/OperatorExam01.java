package day02.exam01;

public class OperatorExam01 {

	public static void main(String[] args) {
		//단항 연산자
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		//int보다 작은 타입의 변수는 부호연산시 int로 자동타입변환
		byte b = 100;
		int result3 = -b;
		System.out.println("result3 : " + result3);
		
		//증감연산자
		int num1 = 10;
		int num2 = 20;
		int num5 = 20;
		int num3;
		int num4;
		
		System.out.println("-------------------------------------");
		num1++;
		++num1;
		System.out.println("num1은 " + num1);
		
		num3 = num2++;           //num3 20 num2 21
		num4 = ++num5;           //num4 21
		System.out.println("num3는 " + num3);
		System.out.println("num4는 " + num4);
		
		int x1 = 1;
		x1++;
		++x1;
		int z = x1++;  //z=3, x=4
		int y = ++x1;   //y=5, x=5

	}

}

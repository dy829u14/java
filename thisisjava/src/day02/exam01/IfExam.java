package day02.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
//		String str = scan.nextLine();
		int number = Integer.parseInt(scan.nextLine());
		if(number%2==1) {
			System.out.println("홀수입니다");
		} else {
			System.out.println("짝수입니다");
		}
		int score = 85;
		//삼항연산자
		char grade = (score > 90) ? 'a' : (score > 80) ? 'b' : (score > 60) ? 'c' : 'd';
		System.out.println(grade);

		}
		

}

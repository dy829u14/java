package day02.sec02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		//nextLine() String nextInt() int
		int number = scan.nextInt();
		if(number%3 ==0) {
			System.out.println(number + "는 3의 배수입니다");
		}
		if(number%5 ==0) {
			System.out.println(number + "는 5의 배수입니다");
		}
		
	

	}

}

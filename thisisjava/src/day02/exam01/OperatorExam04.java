package day02.exam01;

import java.util.Scanner;

public class OperatorExam04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int charCode = 'D';
		
		if((charCode >= 65) && (charCode <= 90)) {
			System.out.println("대문자이다.");
		}
		if((charCode >= 97) && (charCode <= 122)) {
			System.out.println("소문자이다");
		}
		int num = Integer.parseInt(scan.nextLine());
		if((num%2==0) && (num%3==0)) {
			System.out.println("2의 배수이면서 3의 배수이다");
		}
		if((num%2==0) || (num%3==0)) {
			System.out.println("2의 배수 또는 3의 배수이다");
		}

	}


}
//1. 31 2. 가 3. true false
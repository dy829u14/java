package day02.sec02;

import java.util.Scanner;

public class PracticeExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userId = scan.nextLine();
		
		String str1 = "김그린";
		String str2 = "김그린";
		
		String str3 = new String("김그린");
		String str4 = new String("김그린");
		//참조변수를 비교시 == 연산자는 참조번지를 바교한다
		//문자열 내용의 비교는 문자열.equals("문자열")
		
		System.out.println(str1 == str2);
		System.out.println(str3.equals(str4));
		

		
		

	}

}

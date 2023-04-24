package day05.exam01;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		Scanner scan = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scan.nextLine();
		} while (!inputString.equals("q"));
		System.out.println();
		
		System.out.println("프로그램 종료");

	}

}

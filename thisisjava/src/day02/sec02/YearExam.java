package day02.sec02;

import java.util.Scanner;

public class YearExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int year = scan.nextInt();
		
		if(year%4==0) {
			 
			if (year%100==0) {
				 
				if (year%400==0) {
						System.out.println("윤년입니다");
				 }
			 
			} 
			
			System.out.println("윤년입니다");
		
		} 
		else {
			System.out.println("평년입니다");
		}

	}

}

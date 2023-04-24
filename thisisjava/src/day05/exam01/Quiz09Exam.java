package day05.exam01;

import java.util.Scanner;

public class Quiz09Exam {

	public static void main(String[] args) {
		// 키보드로부터 학생 수와 각 학생들의 점수를 입력받고 while문과 Scanner의 nextLine()
		// 메소드를 이용해서 최고 점수 및 평균 점수를 출력하는 코드 작성
		Scanner scan = new Scanner(System.in);
		int[] scores = null;
		
		
		
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택>");
			String num = scan.nextLine();
			
			
			
			if(num.equals("1")) {
				System.out.print("학생수>");
				int stu = (int) Integer.parseInt(scan.nextLine());
				int[] scores = new int[stu];
			}
			else if(num.equals("2")) {
				for(int i : scores) {
					System.out.println();
				}
			}
		}
			
	}

}

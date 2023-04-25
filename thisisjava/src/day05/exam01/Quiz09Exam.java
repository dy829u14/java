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
				scores = new int[stu];
			}
			else if(num.equals("2")) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores ["+i+"]");
					scores[i] = (int) Integer.parseInt(scan.nextLine());
				}
			}
			else if(num.equals("3")) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores ["+i+"] : "+scores[i]);					
				}
			}
			else if(num.equals("4")) {
				int max = 0;
				int sum = 0;
				double avr = 0.0;

				
				for(int i=0; i<scores.length; i++) {
					if(scores[i]>max) {
						max = scores[i];
					}
					sum += scores[i];					
				}
				avr = (double) sum/scores.length;
				System.out.println("최고점수는 : "+max);
				System.out.println("평균점수는 : "+avr);
			}
			else if(num.equals("5")) {
				System.out.println("프로그램 종료");
				break;
				
			}
			else {
				System.out.println("바르게 입력해주세요");
			}
		

		}
			

	}}
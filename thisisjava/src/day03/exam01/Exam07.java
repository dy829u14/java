package day03.exam01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		while(true) {
			System.out.println("---------------------------------");
			System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("---------------------------------");
			System.out.println("선택>");
			String str = scan.nextLine();
			
			if(str.equals("1")) {
				System.out.print("예금액>");
				int addmoney = (int) Integer.parseInt(scan.nextLine()); 
				money += addmoney;
			} else if(str.equals("2")) {
				System.out.print("출금액");
				int minusmoney = (int) Integer.parseInt(scan.nextLine());
				money -= minusmoney;
			} else if(str.equals("3")) {
				System.out.print("잔고>");
				System.out.println(money);
			} else if(str.equals("4")) {
				break;
			}
		}
		System.out.println("프로그램 종료");
		
	}

} 

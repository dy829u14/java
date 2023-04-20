package day02.sec02;

import java.util.Scanner;

public class GameExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작!");
		
		String user = scan.nextLine();
		
		int com = (int) (Math.random()*3);
		
		
		if(user.equals("가위") && com==0) {
			System.out.println("유저: 가위, 컴퓨터: 바위 패배");
		}
		if(user.equals("가위") && com==1) {
			System.out.println("유저: 가위, 컴퓨터: 보 승리");
		}
		if(user.equals("가위") && com==2) {
			System.out.println("유저: 가위, 컴퓨터: 가위 무승부");
		}
		if(user.equals("바위") && com==0) {
			System.out.println("유저: 바위, 컴퓨터: 바위 무승부");
		}
		if(user.equals("바위") && com==1) {
			System.out.println("유저: 바위, 컴퓨터: 보 패배");
		}
		if(user.equals("바위") && com==2) {
			System.out.println("유저: 바위, 컴퓨터: 가위 승리");
		}
		if(user.equals("보") && com==0) {
			System.out.println("유저: 보, 컴퓨터: 바위 승리");
		}
		if(user.equals("보") && com==1) {
			System.out.println("유저: 보, 컴퓨터: 보 무승부");
		}
		if(user.equals("보") && com==2) {
			System.out.println("유저: 보, 컴퓨터: 가위 패배");
		}
		
		


	}

}

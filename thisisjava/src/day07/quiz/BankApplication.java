package day07.quiz;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//길이가 100인 Account2[]배열로 관리
		//문자열 배열 - String[] strs = new String[10];
		Account2[] accounts = new Account2[100];
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			String selectNum = scan.nextLine();  //입력값을 selectNum에 할당
			
			if(selectNum.equals("1")) {
				System.out.println("--------------");
				System.out.println("계좌생성");
				System.out.println("--------------");
				Account2 account = new Account2();
				System.out.println("계좌번호 : ");
				//account객체의 accountNum필드 값을 입력값으로 변경
				account.setAccountNum(scan.nextLine());
				System.out.println("계좌주 : ");
				account.setAccountName(scan.nextLine());
				System.out.println("초기입금액 : ");
				account.setBalance(Integer.parseInt(scan.nextLine()));
				
				for(int i =0; i<accounts.length; i++) {
					if(accounts[i]==null) {
						accounts[i] = account;
						System.out.println("계좌가 생성되었습니다");
						break;
					}
				}
				
			}else if(selectNum.equals("2")) {
				System.out.println("--------------");
				System.out.println("계좌목록");
				System.out.println("--------------");
				for(Account2 a : accounts) {
					if(a==null) {
						break;
					}
					System.out.println("계좌번호 : "+a.getAccountNum()+"   성명 : "+a.getAccountName()+"    잔액 : "+a.getBalance());
				}
			}else if(selectNum.equals("3")) {
				System.out.println("--------------");
				System.out.println("예금");
				System.out.println("--------------");
				System.out.println("계좌번호 입력 : ");
				String accountN = scan.nextLine();
				System.out.println("예금액 : ");
				int price = Integer.parseInt(scan.nextLine());
				//계좌번호에 해당하는 계좌가 있을 경우 잔고에서 금액을 더해준다
				for(Account2 a: accounts) {
					//각 계좌의 계좌번호와 입력한 계좌번호가 일치하는지
					//일치하면 그 계좌에 있는 잔고에서 입력한 금액을 더해서 변경
					if(a.getAccountNum().equals(accountN)) {
						a.setBalance(a.getBalance()+price);
						System.out.println("결과 : 예금이 되었습니다");						
						break;
					}else {
						System.out.println("없는 계좌입니다");
						break;
					}
				}
				
			}
			else if(selectNum.equals("4")) {
				System.out.println("--------------");
				System.out.println("출금");
				System.out.println("--------------");
				System.out.println("계좌번호 입력 : ");
				String accountN = scan.nextLine();
				System.out.println("출금액 : ");
				int price = Integer.parseInt(scan.nextLine());
				//계좌번호에 해당하는 계좌가 있을 경우 잔고에서 금액을 더해준다
				for(Account2 a: accounts) {
					//각 계좌의 계좌번호와 입력한 계좌번호가 일치하는지
					//일치하면 그 계좌에 있는 잔고에서 입력한 금액을 더해서 변경
					if(a.getAccountNum().equals(accountN)) {
						a.setBalance(a.getBalance()-price);
						System.out.println("결과 : 출금되었습니다");
						break;
					}
					else {
						System.out.println("없는 계좌입니다");
					}
				}
			}
			else if(selectNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("선택숫자만 입력하세요");
			}
		}//while문 블럭

	}//main 메소드 블럭
	

}


package day07.quiz;

import java.util.Scanner;

public class BankApplicationRe {
	static Scanner scan = new Scanner(System.in);
	
	//길이가 100인 Account2[]배열로 관리
	//문자열 배열 - String[] strs = new String[10];
	static Account2[] accounts = new Account2[100];
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("-------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			String selectNum = scan.nextLine();  //입력값을 selectNum에 할당
			
			if(selectNum.equals("1")) {
				printTitle("계좌생성");
				createAccount();
				
			}else if(selectNum.equals("2")) {
				printTitle("계좌목록");
				accountList();
				
			}else if(selectNum.equals("3")) {
				printTitle("예금");				
				addBalance("예금");
				
			}
			else if(selectNum.equals("4")) {
				printTitle("출금");
				addBalance("출금");
			}
			else if(selectNum.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("선택숫자만 입력하세요");
			}
		}//while문 블럭

	}//main 메소드 블럭
	//출력메소드
	public static void printTitle(String str) {
		System.out.println("--------------");
		System.out.println(str);
		System.out.println("--------------");
	}
	//계좌생성 메소드
	private static void createAccount() {
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
	}
	//계좌 목록 보기\
	private static void accountList() {
		for(Account2 a : accounts) {	
			if(a==null) {
				break;
			}
			System.out.println("계좌번호 : "+a.getAccountNum()+
					"   성명 : "+a.getAccountName()+
					"   잔액 : "+a.getBalance());
		}
	}
	//예금, 출금 하기
	private static void addBalance(String text) {
		System.out.println("계좌번호 입력 : ");
		String accountN = scan.nextLine();
		System.out.println(text+"액 : ");
		int price = Integer.parseInt(scan.nextLine());
		//계좌번호에 해당하는 계좌가 있을 경우 잔고에서 금액을 더해준다
		Account2 account = findAccount(accountN);
		if(account==null) {
			System.out.println("없는 계좌입니다");
			return;
		}
		int balance = text.equals("예금") ? 
				account.getBalance()+price : 
				account.getBalance()-price;
		account.setBalance(balance);
		System.out.println("결과 : "+text+"성공");
	}
	
	//accounts배열에서 일치하는 계좌번호가 있으면 해당하는 account 객체를 리턴해주는 메소드
	//findAccount의 리턴값이 null이면 없는 계좌
	//null이 아니면 있는 계좌
	private static Account2 findAccount(String accountNum) {
		Account2 account = null;
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null) {
				if(accounts[i].getAccountNum().equals(accountNum)) {
					account = accounts[i];
					break;
				}
			}
			
		}return account;
	}
	
	

}


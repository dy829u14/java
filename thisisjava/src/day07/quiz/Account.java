package day07.quiz;

public class Account {
	//인스턴그 필드 : 잔고
	private int balance;
	
	//정적 필드 , 상수	
	static final int MIN_BALANCE =0;
	static final int MAX_BALANCE =1000000;
	
	public int getBalance() {
		return this.balance;
	}
	public void setBalance(int balance) {
		//잔고 값을 수정할때 수정값이 0보다 작은 음수이거나
		//1000000보다 크면 원래 있던 잔고값으로 지정
		if(balance >= Account.MIN_BALANCE && balance <= Account.MAX_BALANCE) {
			this.balance = balance;
		}
		//String str = 조건? "a" : "b";
//		this.balance = balance >= Account.MIN_BALANCE && 
//				balance <= Account.MAX_BALANCE ? 
//				balance : this.balance;
	}
	
	
	

}

package day12.exam03;

public class Account {
	//필드
	private long balance;
	
	//생성자
	public Account() {}
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance+=money;
	}
	public void withdrow(int money) throws InsufficientException {
		if(balance < money) {
			throw new InsufficientException("잔고부족 : "+(money-balance)+"원 모자람");
		}
		balance-=money;
	}
}

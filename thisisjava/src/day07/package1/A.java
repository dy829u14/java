package day07.package1;

public class A {
	//필드 선언
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	String name = "green";
	//default 접근 제한 - 같은 패키지에서만 접근
	int age;
	//private 필드
	private int speed;
	
//	생성자 선언
	public A(boolean b) {
		this.speed = 10;
	}
	A(int b) {
		
	}
	private A(String s) {
		
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
		}else {
		this.speed = speed;
		}
	}

}

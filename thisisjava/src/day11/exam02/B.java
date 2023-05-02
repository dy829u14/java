package day11.exam02;

public class B {
	//B의 인스턴스 필드와 메소드
	int field1;
	void method1() {
		
	}
	//B의 정적 필드와 메소드
	static int field2;
	static void method2() {
		
	}
	//인스턴스 멤버 클래스
	class C {
		void method() {
			//B의 인스턴스 필드와 메소드 사용
			field1 = 10;
			method1();
			//B의 정적 필드와 메소드 사용
			field2 = 10;
			method2();
		}
	}
	//정적 멤버클래스
	static class D {
		void method() {
			//B의 인스턴스 필드와 메소드 사용 불가
//			field1 = 20;
//			method1();
			//B의 정적 필드와 메소드 사용 가능
			field2 = 10;
			method2();
		}
	}
}

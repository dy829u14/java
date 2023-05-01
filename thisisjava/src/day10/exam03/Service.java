package day10.exam03;

public interface Service {
	//디폴트 메소드
		default void defaultMethod1() {
			System.out.println("defaultMethod코드");
			defMethod3();
		}
		default void defaultMethod2() {
			System.out.println("defaultMethod코드");
			defMethod3();
			staticCommon(); //private,메소드, private 정적 메소드 호출 가능
		}
		//private메소드
		private void defMethod3() {
			System.out.println("중복1");
			System.out.println("중복2");
		}
		//정적 메소드
		static void staticMethod1() {
			System.out.println("staticMethod코드");
			staticCommon();
		}
		static void staticMethod2() {
			System.out.println("staticMethod코드");
			staticCommon();  //private 정적 메소드 호출 가능
//			defMethod3(); //정적 메소드 안에서는 private 인스턴스 호출 안됨
		}
		//private 정적 메소드
		private static void staticCommon() {
			System.out.println("중복1");
			System.out.println("중복2");
		}
}

package day13.exam04;

public class TimeExam {

	public static void main(String[] args) {
		//currentTimeMillis() 1/1000초단위
		//1970년 1월 1일 0시부터 현재까지의 시간을 밀리초 단위로 리턴
		//nanotime() 1/10^9 초단위
//		1970년은 1월 0시부터 현재까지의 시간으로 나노조로 리턴
		
		long time1 = System.currentTimeMillis();
		int sum = 0;
		for(int i=0; i<=1000000000;i++) {
			sum+=i;
		}
		for(int i=0; i<=1000000000;i++) {
			sum+=i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println("계산에"+(time2-time1)+"나노초가 쇼요했습니다");

	}

}

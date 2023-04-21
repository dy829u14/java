package day03.exam01;

public class ForExam01 {

	public static void main(String[] args) {
		//1~10 더해서 합계를 출력
		int sum = 0;
		for(int i=1; i<11; i++) {
			sum = sum + i;
			//홀수일때만 출력

			System.out.println("1~10을 더하면 " +sum + "이다.");
		
		}
		System.out.println(sum);

	}

}

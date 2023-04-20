package day01.exam04;

public class PrintExam {

	public static void main(String[] args) {
		//System.out 표준출력장치
		System.out.print("안녕");
		System.out.print("안녕");
		System.out.print("안녕");
		
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");
		
		System.out.printf("내이름은 %s이다 나이는 %d이다.", "김그린", 25);
		System.out.printf("이름 : %-10s , 나이: %05d", "abc", 20);
		System.out.println();
		System.out.printf("%010.4f",12.123456);
	}

}

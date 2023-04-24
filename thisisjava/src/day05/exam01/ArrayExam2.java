package day05.exam01;

public class ArrayExam2 {

	public static void main(String[] args) {
		
		String[] fruits = {"🥝","🍍","🍑","🍌","🍒"};
		fruits[1] = "🍏";
		for(int i =0; i<5; i++) {
			System.out.println(fruits[i]);
		}
		//배열변수 선언과 배열생성
		int[] intArr = new int[5];
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		intArr[0] = 10;
		intArr[1] = 20;
		intArr[2] = 30;
		intArr[3] = 40;
		intArr[4] = 50;
		for(int i=0; i<5; i++) {
			System.out.println(intArr[i]);
		}
		
		String[] strArr = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(strArr[i]);
		}
		strArr[0] = "그린";
		strArr[1] = "레드";
		strArr[2] = "블루";
		for(int i=0; i<3; i++) {
			System.out.println(strArr[i]);
		}
		int[] numberArr = new int[10];
		for(int i=0; i<10; i++) {
			numberArr[i] = i+1;		
		}
		for(int i=0; i<10; i++) {
			System.out.println(numberArr[i]);
		}
		//배열 변수 선언
		int[] scores;
		//배열 변수에 배열을 대입
//		scores = {84,90,98}; 에러발생
		scores = new int[] {84,90,98};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			
			
		}System.out.println(sum);
		//배열길이 배열변수.length  배열의 길이를 정수로 리턴

	}

}

package day05.exam01;

public class Quiz07Exam {

	public static void main(String[] args) {
		// 주어진 배열 항목에서 최대값을 출력하는 코드 작성
		int[] array = {1,5,3,8,2};
		int max = 0;
		
		for(int i=0; i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		System.out.println(max);

	}

}

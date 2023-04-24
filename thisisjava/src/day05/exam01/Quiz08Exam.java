package day05.exam01;

public class Quiz08Exam {

	public static void main(String[] args) {
		// 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드 작성(중첩 for문 이용)
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		int sum = 0;
		int a=0;
		int evr = 0;
		
		for(int i=0; i<array.length; i++) {
			a += array[i].length;
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];				
				evr = sum/a;
			}
		}
		System.out.println("전체의 합은 : "+sum);
		System.out.println("전체의 평균은 : "+evr);
		
		

	}

}

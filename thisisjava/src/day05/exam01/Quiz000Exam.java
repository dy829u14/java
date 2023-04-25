package day05.exam01;

import java.util.Scanner;

public class Quiz000Exam {

	public static void main(String[] args) {
		// 배열을 생성하고 {10,30,20,50,60}
		// 인덱스 번호 2개를 입력받아, 그 값의 자리를 서로 바꿔보자.
		Scanner scan = new Scanner(System.in);
		int[] array = {10,30,20,50,60};
		
		System.out.println("숫자 2개를 입력하세요");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		int tmp;
		tmp = array[index1];
		array[index1] = array[index2];
		array[index2] = tmp;
		
		for(int i: array) {
						System.out.println(i);						
		}
		
		

	}

}

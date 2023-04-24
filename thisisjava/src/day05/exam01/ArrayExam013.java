package day05.exam01;

import java.util.Scanner;

public class ArrayExam013 {

	public static void main(String[] args) {
		//5개의 정수를 입력받아서 내림차순으로 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("5개의 정수 입력");
		int[] num = new int[5];
		int tmp = 0;
		for(int i=0; i<num.length; i++) {
			num[i] = scan.nextInt();
		}
		
		for(int i=0; i<num.length-1; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i]<num[j]) {
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		

	}

}

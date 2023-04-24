package day05.exam01;

import java.util.Scanner;

public class ArrayExam03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//제일 큰수 구하기
		//숫자 5개를 입력받고 배열에 넣고 그 중 큰수 구하기
		int[] nums = new int[5]; // {0,0,0,0,0}
		System.out.print("숫자 5개 : ");
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		//큰수를 담을 변수
		int maxNum = nums[0];
//		//nums[1]숫자가 maxNum 보다 크나요? -->크면 maxNum에 nums[1] 할당
//		//nums[2]가 maxNum 보다 크나요? -->크면 maxNum에 nums[2] 할당
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>maxNum) {
				maxNum = nums[i];
			}
		}
		System.out.println("최대값 : "+maxNum);
		
		int minNum = nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<minNum) {
				minNum = nums[i];
			}
		}
		System.out.println("최소값 : "+minNum);
		scan.close();

	}

}

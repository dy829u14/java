package day05.exam01;

import java.util.Scanner;

public class ArrayExam011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 10번 입력하세요");
		int[] nums = new int[10];
		
		for(int i =0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		int maxNum = 0;
		int minNum = 10000;
		for(int i =0; i<nums.length; i++) {
			if(nums[i]%2==0 && nums[i] > maxNum) {
				maxNum = nums[i] ;
				} 
			else if(nums[i]%2==1 && nums[i] < minNum) {
				minNum = nums[i] ;
				}
			}
		System.out.println("짝수 중 최대값은 : "+maxNum);
		System.out.println("홀수 중 최소값은 : "+minNum);
		
	}
		
} 
	
		

	



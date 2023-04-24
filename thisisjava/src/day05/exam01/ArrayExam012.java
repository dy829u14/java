package day05.exam01;

public class ArrayExam012 {

	public static void main(String[] args) {
		//5개의 정수를 {95,75,85,100,50}으로 초기화하고 오름차순으로 정렬
		int[] nums = {95, 75, 85, 100, 50};
		//{75.98.85.100.50}
		//{50,95,85,100,75}
		int tmp = 0;
		for(int i=0; i<nums.length-1; i++) {
			for(int j =i+1; j<nums.length; j++) {
				//nums[i] 보다 num[j] 작으면 바꾸기
				if(nums[i]>nums[j]) {
					tmp = nums[i];         //nums[0]을 tmp에 담기
					nums[i] = nums[j];     //nums[1]을 nums[0]에 담기
					nums[j] = tmp;         //tmp를 nums[1]에 담기
					
				}
			}
		}
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

}

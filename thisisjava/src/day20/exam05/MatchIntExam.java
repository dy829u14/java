package day20.exam05;

import java.util.Arrays;

public class MatchIntExam {

	public static void main(String[] args) {
		int[] intArr = {2,4,6};
		//intArr의 모든 요소가 2의 배수인가?
		boolean result = Arrays.stream(intArr)
				.allMatch(num->num%2==0);
		System.out.println("모든 요소가 2의 배수인가? "+result);
		
		boolean result2 = Arrays.stream(intArr)
				.anyMatch(n->n%3==0);
		System.out.println("3의 배수가 하나라도 있는가? "+result2);
		
		boolean result3 = Arrays.stream(intArr)
				.noneMatch(n->n%3==0);
		System.out.println("3의 배수가 하나도 없는가? "+result3);

	}

}

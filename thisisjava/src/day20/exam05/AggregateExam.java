package day20.exam05;

import java.util.Arrays;

public class AggregateExam {

	public static void main(String[] args) {
		// 정수 배열
		int[] arr = {1,2,3,4,5};
		
		//카운팅
		long count = Arrays.stream(arr)
				.filter(n->n%2==1)
				.count();
		System.out.println("홀수인 요소의 개수 : "+count);
		
		//총합
		long sum = Arrays.stream(arr)
				.filter(n->n%2==1)
				.sum();
		System.out.println("홀수의 총합 : "+sum);
		
		//평균
		double avg = Arrays.stream(arr)
				.filter(n->n%2==1)
				.average()
				.getAsDouble();
		System.out.println("홀수의 평균 : "+avg);
		
		//최대값
		int max = Arrays.stream(arr)
				.filter(n->n%2==1)
				.max()
				.getAsInt();
		System.out.println("홀수의 최대값 : "+max);
		
		//최소값
		int min = Arrays.stream(arr)
				.filter(n->n%2==1)
				.min()
				.getAsInt();
		System.out.println("홀수의 최소값 : "+min);
		
		//첫번째 요소
		int first = Arrays.stream(arr)
				.filter(n->n%2==1)
				.findFirst()
				.getAsInt();
		System.out.println("첫번째 홀수의 값 : "+first);

	}

}

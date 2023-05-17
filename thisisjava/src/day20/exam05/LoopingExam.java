package day20.exam05;

import java.util.Arrays;

public class LoopingExam {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		//잘못 작성 - 최종처리가 없어서 동작하지 않음
		Arrays.stream(intArr)
		.filter(a->a%2 == 0)
		.peek(n->System.out.println(n));
		
		//중간처리 메소드 peek()를 사용해서 반복
		int total = Arrays.stream(intArr)
		.filter(a->a%2 == 0)
		.peek(n->System.out.println("중간처리"+n))
		.sum();
		
		//최종처리 메소드 forEach()
		Arrays.stream(intArr)
		.filter(a->a%2 == 0)
		.forEach(n->System.out.println("forEach"+n));
		
	}

}

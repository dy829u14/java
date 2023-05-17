package day20.exam05;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		//예외 발생(java.util.NoSuchElementException)
//		double avg = list.stream()
//				.mapToInt(n->n)
//				.average()
//				.getAsDouble();
		
		//방법1
		OptionalDouble optional = list.stream()
				.mapToInt(n->n)
				.average();
		if(optional.isPresent()) {
			System.out.println("방법1 평균 : "+optional.getAsDouble());
		}else {
			System.out.println("방법1 평균 : 0.0");
		}
		
		//방법2
		double avg = list.stream()
				.mapToInt(n->n)
				.average()
				.orElse(0.0);
		System.out.println("방법2 평균 : "+avg);
		
		//방법3
		list.stream()
		.mapToInt(n->n)
		.average()
		.ifPresent(a->System.out.println("하하핳"));

	}

}

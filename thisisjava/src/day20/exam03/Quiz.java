package day20.exam03;

import java.util.ArrayList;
import java.util.List;

public class Quiz {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(70);
		list.add(60);
		list.add(90);
		
		//중복제거
		list.stream().distinct()
		.forEach(a->System.out.println(a));
		
		System.out.println("=================================");
		
		list.stream().distinct()
				.filter(f->f >= 70)
				.forEach(f->System.out.println(f));
		
		System.out.println("---------------------------------");
		
		double avg = list.stream().distinct()
		.filter(f->f >= 70)
		.mapToInt(f-> (int) f)
		.average().getAsDouble();
		
		System.out.println(avg);
		
		
	}

}

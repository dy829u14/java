package day20.exam03;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringExam {

	public static void main(String[] args) {
		// List 컬렉션
		List<String> list = new ArrayList<>();
		list.add("강수지");
		list.add("이채라");
		list.add("김그린");
		list.add("김그린");
		list.add("김범수");
		
		//스트림 생성
		Stream<String> stream = list.stream();
		stream.forEach(str->System.out.println(str));
		
		System.out.println("--------------------------------");
		//중복요소제거
		list.stream().distinct()
		.forEach(str->System.out.println(str));
		
		System.out.println("--------------------------------");
		list.stream().distinct()
		.filter(f->f.startsWith("김"))
		.forEach(str->System.out.println(str));
	}

}

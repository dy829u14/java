package day20.exam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExam {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("홍길동", "남", 92));
		stuList.add(new Student("김세라", "여", 85));
		stuList.add(new Student("김승민", "남", 79));
		stuList.add(new Student("이청하", "여", 90));
		stuList.add(new Student("강수지", "여", 73));
		
		//남학생만 새로운 List로
		List<Student> maleList = stuList.stream()
				.filter(s->s.getGender().equals("남"))
				.collect(Collectors.toList());
		
		maleList.stream()
		.forEach(s->System.out.println(s.getName()));
		
		Map<String,Integer> map = stuList.stream()
				.collect(Collectors.toMap(
						s->s.getName(),    //Student객체에서 키가 될 부분 리턴
						s->s.getScore()    //Student객체에서 값이 될 부분 리턴
						));
		
		System.out.println(map);
	}

}

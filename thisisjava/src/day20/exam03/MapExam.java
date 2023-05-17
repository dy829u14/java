package day20.exam03;

import java.util.ArrayList;
import java.util.List;

public class MapExam {

	public static void main(String[] args) {
		List<Student> stuList = new ArrayList<>();
		stuList.add(new Student("김그린", 85));
		stuList.add(new Student("이채라", 90));
		stuList.add(new Student("강수지", 82));
		stuList.add(new Student("홍진호", 75));
		stuList.add(new Student("이지은", 60));
		
		stuList.stream()
		.mapToInt(s->s.getScore())
		.filter(s->s>=70)
		.forEach(score->System.out.println(score));
		
		System.out.println("-----------------");
		
		double avg = stuList.stream()
				.mapToInt(n-> n.getScore())
				.filter(n->n>=70)
				.average().getAsDouble();
		System.out.println(avg);
	}

}

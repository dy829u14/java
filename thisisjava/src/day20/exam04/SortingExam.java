package day20.exam04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingExam {

	public static void main(String[] args) {
		// List컬렉션 생성
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("김그린", 30));
		studentList.add(new Student("이재라", 10));
		studentList.add(new Student("유미정", 20));
		
		//점수를 기준으로 오름차순 정렬한 새 스트림 얻기
		studentList.stream()
		.sorted((s1,s2)->Integer.compare(s2.getScore(), s1.getScore()))  //s1,s2 순서 바꾸면 내림차순정렬로 변환
		.forEach(s->System.out.println(s.getName()+" : "+s.getScore()));
		
		studentList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s->System.out.println(s.getName()+" : "+s.getScore()));

	}

}

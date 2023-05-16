package day20.exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExam {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 10));
		list.add(new Student("김그린", 10));
		list.add(new Student("김기동", 10));
		
		//방법1
		//오리지날 스트림
		Stream<Student> studentStream = list.stream();
		
		//중간처리(학생 객체를 점수로 매핑)
		IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		
		//최종처리
		double avg = scoreStream.average().getAsDouble();
		System.out.println(avg);
		
		//메소드 체이닝 패턴
		double avg2 = list.stream()
					.mapToInt(student->student.getScore())
					.average()
					.getAsDouble();
	}

}

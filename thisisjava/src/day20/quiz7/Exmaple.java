package day20.quiz7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exmaple {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")				
				);
		
//		List<Member> developers = list.stream()
//				.filter(s->s.getJob().equals("개발자"))
//				.toList();
//		                                                              //7번 문제
//		developers.stream()
//		.forEach(s->System.out.println(s.getName()));
		
		Map<String, List<Member>> groupingMap = list.stream()
				.collect(Collectors.groupingBy(s->s.getJob()));
		
		System.out.println("[개발자]");
		List<Member> programmer = groupingMap.get("개발자");
		programmer.stream().forEach(p->System.out.println(p));        //8번 문제
		System.out.println();
		
		System.out.println("[디자이너]");
		List<Member> designer = groupingMap.get("디자이너");
		designer.stream().forEach(p->System.out.println(p));

	}

}

package day20.quiz;

import java.util.Arrays;
import java.util.List;

public class Exam {

	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"this is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		list.stream()
		.filter(f->f.toLowerCase().contains("java"))
		.forEach(str->System.out.println(str));

	}

}

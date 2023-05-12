package day18.exam01;

import java.util.TreeSet;

public class PersonTreeSetExam {

	public static void main(String[] args) {
		//정렬이 되려면 Comparable인터페이스 구현
		TreeSet<Person> treeset = new TreeSet<>(new PersonComparator());
		treeset.add(new Person("김그린", 30));
		treeset.add(new Person("이그린", 20));
		treeset.add(new Person("박그린", 40));
		for(Person p: treeset) {
			System.out.println(p.name+" "+p.age);
		}

	}

}

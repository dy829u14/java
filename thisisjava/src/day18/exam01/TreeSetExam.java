package day18.exam01;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		//TreeSet컬렉션 생성하기 Set인터페이스 구현
		TreeSet<Integer> treeset = new TreeSet<>();
		
		//객체 저장  ---> 오름차순 정렬
		treeset.add(10);
		treeset.add(7);
		treeset.add(12);
		treeset.add(5);
		treeset.add(19);
		treeset.add(1);
		
		System.out.println(treeset);
		
		Integer firstNum = treeset.first();
		Integer lastNum = treeset.last();
		System.out.println(firstNum);
		System.out.println(lastNum);
		
		Integer lowerNum = treeset.lower(7);
		System.out.println("7보다 작은 숫자 : "+lowerNum);
		Integer higherNum = treeset.higher(10);
		System.out.println("10보다 큰 숫자 : "+higherNum);
		
		Integer floorNum = treeset.floor(11);
		System.out.println(floorNum);
		
		System.out.println("---------------------");
		
		//내림차순 반복자 리턴 descendingIterator()
		Iterator<Integer> iterator = treeset.descendingIterator();
		while(iterator.hasNext()) {
			int a = iterator.next();
			System.out.println(a);
		}
		//내림차순 set을 리턴 descendingSet()
		NavigableSet<Integer> treeset2 = treeset.descendingSet();
		System.out.println(treeset2);
		NavigableSet<Integer> treeset3 = treeset.tailSet(10, true);
		System.out.println(treeset3);
		NavigableSet<Integer> treeset4 = treeset.subSet(7, false, 15, false);
		System.out.println(treeset4);

	}

}

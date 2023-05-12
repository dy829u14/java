package day18.exam01;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TreeMap컬렉션 생성
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//엔트리 저장 / 오름차순 정렬(정렬기준 key값)
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("descropton", 20);
		treeMap.put("ever", 30);
		treeMap.put("odd", 15);
		
		//Map은 향상된 for문에 사용불가
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Entry<String, Integer> entry: treeMap.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		//특정 키에 대한 값 가져오기
		Entry<String, Integer> reEntry = null;
		reEntry = treeMap.firstEntry();
		System.out.println(reEntry.getKey()+" "+reEntry.getValue());
		reEntry = treeMap.lastEntry();
		System.out.println(reEntry.getKey()+" "+reEntry.getValue());
		//기준보다 앞단어
		reEntry = treeMap.lowerEntry("green");
		System.out.println(reEntry.getKey()+" "+reEntry.getValue());
		//기준보다 뒤의 단어
		reEntry = treeMap.higherEntry("green");
		System.out.println(reEntry.getKey()+" , "+reEntry.getValue());
		
		//내림차순으로 정렬하기
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		//Map ===> Set으로 변환 리턴
		Set<Entry<String, Integer>> descendingSet = descendingMap.entrySet();
		for(Entry<String,Integer> e: descendingSet) {
			System.out.println(e.getKey()+" - " +e.getValue());
		}
		
		//범위 검색
		System.out.println("[c~d사이의 단어 검색]");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true, "t", true);
		for(Entry<String,Integer> a: rangeMap.entrySet()) {
			System.out.println(a.getKey()+" * "+a.getValue());
		}
		
	}

}

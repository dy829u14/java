package day17.exam03;

import java.util.*;
import java.util.Map.Entry;


public class HashMapExam {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		//객체 저장
		map.put("김그린", 30);
		map.put("홍길동", 34);
		map.put("기성용", 35);
		map.put("손흥민", 32);
		map.put("박지성", 43);
		map.put("홍길동", 22);
		
		//키로 값 받기
		int value = map.get("홍길동");
		System.out.println(value);
		
		int size = map.size();
		System.out.println(size);
		
		//키로 Entry 삭제
		map.remove("김그린");
		int size2 = map.size();
		System.out.println(size2);
		boolean re = map.containsKey("손흥민");
		System.out.println("손흥민 key는 : "+re);
		boolean re2 = map.containsValue(32);
		System.out.println(re2);
		
		//키 set컬렉션 얻고 반복하기
		Set<String> keySet = map.keySet();
		//반복자 얻기
		Iterator<String> keyIterator = keySet.iterator();
		//가져올 값이 있는지 체크
		while(keyIterator.hasNext()) {
			//next()가 값을 가져옴
			String k = keyIterator.next();
			//key로 값을 반환
			Integer v = map.get(k);
			System.out.println(k+" "+v);
		}
		
		//Entry를 Set컬렉션으로 반환 (map ---> set)
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		Iterator<Entry<String,Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String,Integer> entry = entryIterator.next();
			String k = entry.getKey();       //entry key값 리턴
			Integer v = entry.getValue();    //entry value값 리턴
			System.out.println(k+" "+v);
		}
		map.clear();    //map에 있는 Entry제거
		System.out.println(map.isEmpty());    //비어있으면 true, 있으면 false
	}

}

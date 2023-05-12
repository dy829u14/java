package day17.exam03;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExam {

	public static void main(String[] args) {
		//Hashtable컬렉션 생성
		Map<String,Integer> map = new Hashtable<>();
		//작업스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				//Entry 1000개 추가
				for(int i=1;i<=1000;i++) {
					map.put(String.valueOf(i), i);
				}
			}	
		};
		Thread threadB = new Thread() {
			@Override
			public void run() {
				//Entry 1000개 추가
				for(int i=1001;i<=2000;i++) {
					map.put(String.valueOf(i), i);
				}
			}	
		};
		threadA.start();
		threadB.start();
		
		//작업스레드들이 모두 종료될때까지 메인스레드를 기다리게 해야함
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {}
		
		//저장된 총 Entry 수 얻기
		int size = map.size();
		System.out.println("총 엔트리 수 : "+size);
	}

}

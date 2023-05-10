package day16.exam04;

public class WorkObject {
	//동기화 메소드
	public synchronized void methodA() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"메소드A작업실행");
		//다른 스레드 실행대기상태로
		notify();  //다른 스레드 실행 대기상태로(일시정지상태인 스레드를 실행대기상태로)
		try {
			wait();  //자신의 스레드는 일시정지상태로
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//동기화 메소드
	public synchronized void methodB() {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"메소드B작업실행");
		//다른 스레드 실행대기상태로
		notify();  //다른 스레드 실행 대기상태로(일시정지상태인 스레드를 실행대기상태로)
		try {
			wait();  //자신의 스레드는 일시정지상태로
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

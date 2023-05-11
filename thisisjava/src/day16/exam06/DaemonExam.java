package day16.exam06;

public class DaemonExam {

	public static void main(String[] args) {
		AutoSaveThread autosave = new AutoSaveThread();
		//데몬스레드 지정
		autosave.setDaemon(true);
		autosave.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 스레드 종료");

	}

}

package day16.exam01;

import java.awt.Toolkit;

public class BeepPrintRunnableExam {

	public static void main(String[] args) {
		// 스레드 생성하기 - Runnable타입을 익명구현객체로 지정
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					//0.5초 일시정지
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		thread.start();
		
		//작업2 메인스레드 작업
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

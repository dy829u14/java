package day16.exam01;

import java.awt.Toolkit;

public class BeepPrintChildExam2 {

	public static void main(String[] args) {
		// 스레드 생성
		Thread thread = new Thread() {

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
			
		};
		thread.start();
		//메인 스레드 처리
		for(int i=0;i<5;i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

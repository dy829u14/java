package day16.exam02;

public class YieldExam {

	public static void main(String[] args) {
		WorkThread workthreadA = new WorkThread("WorkThreadA");
		WorkThread workthreadB = new WorkThread("WorkThreadB");
		
		workthreadA.start();
		workthreadB.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workthreadA.work = false;
		workthreadB.work = false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		workthreadA.work = true;
		workthreadB.work = false;

	}

}

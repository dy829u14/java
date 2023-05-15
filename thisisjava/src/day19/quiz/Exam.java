package day19.quiz;

public class Exam {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(()->{System.out.println("ok버튼을 클릭했습니다");});
		btnOk.Click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(()->{System.out.println("Cancel버튼을 클릭했습니다");});
		btnCancel.Click();

	}

}

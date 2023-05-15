package day19.exam02;

public class ButtonExam {

	public static void main(String[] args) {
		//ok버튼 객체 생성
		Button button = new Button();
		button.setClickListener(()->{
			System.out.println("ok버튼을 클릭했습니다");
		});
		button.click();
	}

}

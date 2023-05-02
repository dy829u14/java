package day11.exam03;

public class ButtonExam2 {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("OK버튼을 클릭했습니다");
				
			}
		});
		btnOk.touch();
		
		Button btnCan = new Button();
		btnCan.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Cancle버튼을 클릭했습니다");
				
			}
		});
		btnCan.touch();

	}

}

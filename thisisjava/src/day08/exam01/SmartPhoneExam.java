package day08.exam01;

public class SmartPhoneExam {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰","흰색");
		
		System.out.println(myPhone.color);
		System.out.println(myPhone.model);
		System.out.println(myPhone.wifi);
		
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요");
		myPhone.sendVoice("네 반갑습니다");
		myPhone.setWifi(true);
		myPhone.internet();
		myPhone.hangUp();

	}

}

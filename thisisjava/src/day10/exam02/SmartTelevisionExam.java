package day10.exam02;

public class SmartTelevisionExam {

	public static void main(String[] args) {
		//인터페이스 변수선언
		RemoteControl rc = new SmartTelevision();
		Searchable sc = new SmartTelevision();
		
		rc.turnOn();
		rc.setVolume(3);
		rc.turnOff();
//		rc.search("www.naver.com");
		
//		sc.turnOn();
//		sc.setVolume(5);
		sc.search("www.naver.com");
		
		//디폴트메소드
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery();
	}
	

}

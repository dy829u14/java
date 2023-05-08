package day14.exam01;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExam {

	public static void main(String[] args) {
		//시간대ID 출력하기 --> ID명을 문자열 배열로 리턴
		String[] availableDs = TimeZone.getAvailableIDs();
		for(String a: availableDs) {
			System.out.println(a);
		}
		//TimeZone 객체 생성
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar losnow = Calendar.getInstance(timeZone);
		
		int hour = losnow.get(Calendar.HOUR);
		int minute = losnow.get(Calendar.MINUTE);
		int second = losnow.get(Calendar.SECOND);
		
		System.out.println("로스엔젤레스 시간은 : "+hour);
		System.out.println("로스엔젤레스 분은 : "+minute);
		System.out.println("로스엔젤레스 초는 : "+second);

	}

}

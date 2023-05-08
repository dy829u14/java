package day14.exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeCompareExam {

	public static void main(String[] args) {
		//2023년 1월 1일 객체/ 2023년 12월 31일 객체 비교
		//문자열데이터포맷지정
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDateTime startDay = LocalDateTime.of(1990, 2, 27, 0,0,0 );
		System.out.println("시작일 : "+startDay.format(dtf));
		
		LocalDateTime endDay = LocalDateTime.of(2023, 5, 8, 0,0,0 );
		System.out.println("시작일 : "+startDay.format(dtf));
		
		if(startDay.isBefore(endDay)) {
			System.out.println("진행중입니다");
		} else if(startDay.isEqual(endDay)) {
			System.out.println("종료합니다");
		} else if (startDay.isAfter(endDay)) {
			System.out.println("종료했습니다");
		}
		
		long remainYear = startDay.until(endDay, ChronoUnit.YEARS);
		long remainMonth = startDay.until(endDay, ChronoUnit.MONTHS);
		long remainDay = startDay.until(endDay, ChronoUnit.DAYS);
		
		System.out.println("남은 해는 : "+remainYear);
		System.out.println("남은 월은 : "+remainMonth);
		System.out.println("남은 일은 : "+remainDay);
		
		LocalDateTime birth = LocalDateTime.of(1990, 2,27,0,0,0);
		LocalDateTime now = LocalDateTime.now();
		
		long untilDay = birth.until(now, ChronoUnit.DAYS);
		System.out.println("내가 태어난지 "+untilDay+"일이 지났음");

	}

}

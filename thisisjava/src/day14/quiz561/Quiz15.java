package day14.quiz561;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Quiz15 {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime end = LocalDateTime.of(2023, 12,31,0,0,0);
		
		long untilDay = now.until(end, ChronoUnit.DAYS);
		System.out.println(untilDay);
		
		Date now1 = new Date();
		System.out.println(now1.toString());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now1));
		
		

	}

}

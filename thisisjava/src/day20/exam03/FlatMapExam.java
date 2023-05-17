package day20.exam03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("I am a best developer");
		
		list1.stream()
		.flatMap(data -> Arrays.stream(data.split(" ")))
		.forEach(word->System.out.println(word));
		
		//문자열 숫자 스트림을 숫자 스트림 변환
		List<String> list = Arrays.asList("10","20","30","40","50");
		list.stream()
		.flatMapToInt(data -> {
			//String[]배열을 int[]배열로 변경
			String[] strArr = data.split(",");
			//int[]배열 생성
			int[] intArr = new int[strArr.length];
			for(int i=0;i<strArr.length;i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		})
		.forEach(number->System.out.println(number+2));

	}

}

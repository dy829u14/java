package day14.exam02;

import java.util.regex.Pattern;

public class PatternExam {

	public static void main(String[] args) {
		//숫자 02 또는 010 , 010-123-1234, 010-1234-1234
		//(02|010)-\d{3,4}-\d{4}
		String regExp = "(01|010)-\\d{3,4}-\\d{4}";
		String data = "010-5017-4897";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다");
		} else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		//이메일 green@naver.com  green@aaa.co.kr
		// \w+@\w+\.\w+(\.\w+)?
		String emailRegExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String emailstr = "green@naver.com";
		boolean result2 = Pattern.matches(emailRegExp, emailstr);
		if(result2) {
			System.out.println("이메일 정규식이 일치합니다");
		}else {
			System.out.println("이메일 정규식이 일치하지 않습니다");
		}
	}

}

package day14.quiz561;

import java.util.regex.Pattern;

public class Quiz17 {

	public static void main(String[] args) {
		String id = "aAngel1004";
		String regExp = "[a-zA-Z]\\w{7,11}";
		boolean isMatch = Pattern.matches(regExp,id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다");
		}else {
			System.out.println("ID로 사용할 수 없습니다");
		}

	}

}

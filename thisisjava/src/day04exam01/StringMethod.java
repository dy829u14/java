package day04exam01;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "그린컴퓨터아카데미";
		//01. length() 문자열길이 반환
		int strNum = str.length();
		System.out.println(strNum);
		
		//charAt(index) 문자추출 index 0번부터
		//index 0번부터 시작
		char ch = str.charAt(2);
		System.out.println(ch);
		
		//03. replace("특정문자","변경될문자")
		String str2 = "파이썬은 재미있다";
		String str3 = str2.replace("파이썬","자바");
		System.out.println(str3);
		
		//04. substring(startindex, endindex) 문자열 추출
		String str4 = "javascript";
		String str5 = str4.substring(0,4);
		System.out.println(str5);
		String str6 = str4.substring(5);
		System.out.println(str6);
		
		//05.indexOf("찾는문자열")
		//contains("찾는문자열") 있으면 true 없으면, false 리턴
		int charnum = str4.indexOf("j");
		System.out.println(charnum);
		String str7 = "자바 프로그래밍";
		boolean isjava = str7.contains("자바");
		System.out.println(isjava);
		
		//06. split("구분자") 문자열을 0,1,2 배열로 리턴
		String names = "그린,블루,오렌지";
		String[] names2 = names.split(",");
		System.out.println(names2[1]);

	}

}

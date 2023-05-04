package day13.exam05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExam {

	public static void main(String[] args) throws UnsupportedEncodingException {
		//네트워크 통신으로 전송박은 바이트배열을 문자열로 변환할때 사용
		//문자셋 확인 UTF-8, EUC-KR
		
		String data = "자바";
		
		//String -> byte배열
		byte[] arr1 = data.getBytes();
		System.out.println("arr1 : "+ Arrays.toString(arr1));
		
		//byte배열 -> String(기본 : UTF-8 디코딩)
		String str1 = new String(arr1);
		System.out.println(str1);
		
		//String -> byte배열(EUC-KR인코딩)
		byte[] arr2 = data.getBytes("EUC-KR");
		System.out.println("arr2: "+Arrays.toString(arr2));
		
		//byte배열 -> String
		String str2 = new String(arr2, "EUC-KR");
		System.out.println(str2);
	}

}

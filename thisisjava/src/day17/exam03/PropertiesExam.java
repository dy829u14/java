package day17.exam03;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) throws Exception {
		//Properties컬렉션 생성
		Properties properties = new Properties();
		
		properties.load(PropertiesExam.class.getResourceAsStream("pro.properties"));
		
		//주어진 키에 대한 값
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String admin = properties.getProperty("admin");
		String url = properties.getProperty("url");
		String driver = properties.getProperty("driver");
		
		//값 출력
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("admin : "+admin);
		System.out.println("password : "+password);
		System.out.println("username : "+username);

	}

}

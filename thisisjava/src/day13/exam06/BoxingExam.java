package day13.exam06;

public class BoxingExam {
	
	public static void main(String[] args) {
		//Boxing
		Integer obj1 = 200;  //자동 박싱
		Integer obj2 = 300;
		Integer obj3 = new Integer(600);
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		//기본타입 변수에 포장타입 변수 대입시 자동 언박싱
		int value4 = obj1;
		int value5 = obj2;
		int value6 = obj3;
		
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		
		Integer num1 = 200;
		Integer num2 = 200;
		//-128 ~ 127
		Integer num3 = 128;
		Integer num4 = 128;
//		System.out.println(num1 == num2);  //false;
		System.out.println(num1.equals(num2));
		System.out.println(num3 == num4);
		System.out.println(num3.equals(num4));
		
		int a = Integer.parseInt("1220");
		float f = Float.parseFloat("2.456f");
		boolean b = Boolean.parseBoolean("true");
		
	}

}

package day08.exam02;

public class FlowerMain {

	public static void main(String[] args) {
		Rose rose = new Rose("장미", 1500, "핑크");
		Flower flower = new Flower("수선화", 1000);
		Flower flower2 = rose;
		
		rose.flowerInformation();
		flower.overMethod();
		flower2.overMethod();
		rose.method1();
//		flower2.method1();  // Flower 타입이기에 Rose 타입의 메소드 사용 불가 (오버라이딩만 가능)
		

	}

}

package day08.exam01;

public class SmartPhone extends Phone {
	//필드선언
	public boolean wifi;
	public String name;
	public String company;
	
		//생성자 선언
	public SmartPhone(String model, String color) {
		
		//부모 생성자 호출
//		super();  ---> 생략가능(컴파일시 자동 추가)
//		this.model = model;  //phone으로부터 상속
//		this.color = color;  //phone으로부터 상속
		super(model,color);  //매개변수가 있는 생성자일 경우 부모 생성자 생략안됨(반드시 작성)
//		this(model,color,"회사");
	}
	public SmartPhone(String model, String color, String company) {
		super(model,color);
		this.company = company;
	}
	//메소드 생성
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다");
	}
	public void internet() {
		System.out.println("인터넷에 연결합니다");
	}

}

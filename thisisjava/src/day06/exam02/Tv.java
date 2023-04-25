package day06.exam02;

public class Tv {
	//필드
	String brand;
	boolean power = false;
	int channel = 0;
	int volume = 10;
	
	//생성자
	public Tv() {}
	public Tv (String brand) {
		this.brand = brand;
	}
	//메소드
	void powerOn() {
		System.out.println("전원이 켜집니다");
		power = true;
	}
	void powerOff() {
		System.out.println("전원이 꺼집니다");
		power = false;
	}
	void channelUp() {
		if(this.power) {
			this.channel += 1;
			System.out.println("채널 : "+this.channel);		
		}else {
			System.out.println("전원을 켜세요");
		}
	}
	void channelDown() {
		this.channel -= 1;
		System.out.println("채널 : "+this.channel);
	}
	void volumeUp() {
		this.volume += 1;
		System.out.println("음량 : "+this.volume);
	}
	void volumeDown() {
		this.volume -= 1;
		System.out.println("음량 : "+this.volume);
	}
	
}

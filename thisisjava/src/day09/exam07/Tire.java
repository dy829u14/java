package day09.exam07;

public class Tire {
	//필드
	public int maxRotation;            //최대 회전수
	public int accmulatedRotation;     //누적 회전수
	public String location;            //타이어 위치

	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메소드
	public boolean roll() {
		//누적 회전수를 1씩 증가
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + " Tire 수명 : " + (maxRotation-accmulatedRotation));
			return true;
		}else {
			System.out.println("***"+location + "Tire펑크 ***");
			return false;
		}
	}
}

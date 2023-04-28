package day09.exam07;

public class KumhoTire extends Tire{
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation < maxRotation) {
			System.out.println(location + " 금호 Tire 수명 : " + (maxRotation-accmulatedRotation));
			return true;
		}else {
			System.out.println("***"+location + " 금호 Tire펑크 ***");
			return false;
		}
	}
	

}

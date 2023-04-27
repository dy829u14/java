package day08.exam02;

public class SupersonicExam {

	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flymode = 2;
		sa.fly();
		sa.flymode = 1;
		sa.fly();
		sa.land();
		

	}

}

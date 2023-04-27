package day08.exam02;

public class Programmer extends Employ {

	@Override
	public void work() {
		System.out.println("개발하러 갑니다");
	}
	public static void main(String[] args) {
	Programmer p = new Programmer();
	p.work();
	}
	
	

}

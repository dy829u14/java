package day08.exam02;

public class Designer extends Employ {

	@Override
	public void work() {
		System.out.println("디자인 하러 갑니다");
	}
	public static void main(String[] args) {
		Designer d = new Designer();
		d.work();
		}

}

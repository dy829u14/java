package day19.exam02;

public class PersonLamdaExam {

	public static void main(String[] args) {
		Person person = new Person();
		person.action1((x,y)->{
			System.out.println(x+"이 "+y+"을 합니다");
		});
		//홍길동이 프로그래밍을 합니다
		person.action2(x->{
			System.out.println(x+"라고 말합니다");
		});
		//안녕하세요 라고 말합니다

	}

}

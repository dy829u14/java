package day19.exam04;

public class MethodReferenceExam {

	public static void main(String[] args) {
		Person person = new Person();
		//정적메소드일 경우
		
		//익명구현객체
		person.action(new Calculable() {
			
			@Override
			public double calc(double x, double y) {
				return Computer.staticMethod(x, y);
			}
		});
		//람다식
		person.action((x,y)-> {
			return Computer.staticMethod(x, y);
		});
		//람다식 메소드 참조
		person.action(Computer::staticMethod);
		
		//인스턴스 메소드일 경우
		Computer com = new Computer();
		//람다식
		person.action((x,y)->{
			return com.instanceMethod(x, y);
		});
		//람다식 메소드 참조
		person.action(com::instanceMethod);
	}

}

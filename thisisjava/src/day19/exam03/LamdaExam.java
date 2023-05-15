package day19.exam03;

public class LamdaExam {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action((x,y)-> {
			double result = x+y;
			return result;
		});
		
		person.action((x,y)-> x+y);
		
		//리턴문이 하나일 경우 (메소드 호출)
		person.action((x,y)-> {
			return sum(x,y);
		});

	}
	public static double sum(double x, double y) {
		return x+y;
	}

}

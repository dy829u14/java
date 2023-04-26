package day07.exam01;

public class CalculatorExam {

	public static void main(String[] args) {
		System.out.println(Calculator.pi);
		Calculator calc = new Calculator();
		int result1 = calc.divide(50, 5);
		int result2 = calc.plus(10, 20);
//		int result3 = Calculator.divide(20,2);
		System.out.println(result1);
		System.out.println(result2);
		
		System.out.println(Calculator.info);
	}

}

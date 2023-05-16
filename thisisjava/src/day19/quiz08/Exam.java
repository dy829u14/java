package day19.quiz08;

public class Exam {
	
	private static Student[] student = {
		new Student("홍길동", 90, 96),
		new Student("신용재", 95, 93)
	};
	public static double avg(Function<Student> function) {
		int sum = 0;
		for(Student stu : student) {
			sum += function.apply(stu);
		}
		double avg = sum / student.length;
		return avg;
	}
	
	public static void main(String[] args) {
		double englishAvg = avg(s -> s.getEnglishScore());
		System.out.println("영어 평균 "+englishAvg);
		
		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 "+mathAvg);
	}

}

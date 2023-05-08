package day14.quiz561;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		//Student클래스의 인스턴스인지 확인
		//강제타입변환 Student타입으로
		if(obj instanceof Student stu) {
			//Student stu = (Student) obj;
			if(studentNum.equals(stu.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
}

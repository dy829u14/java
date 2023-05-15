package day18.quiz;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student stu) {
			if(studentNum ==stu.studentNum) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
	
}

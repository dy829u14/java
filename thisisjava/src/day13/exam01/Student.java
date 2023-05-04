package day13.exam01;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	public int getNo() {return no;}
	public String getName() {return name;}
	
	@Override
	public int hashCode() {
		int hashCode = no+name.hashCode();
		return hashCode;
	}
	@Override
	public boolean equals(Object obj) {
		//Object타입이 Student클래스의 인스턴스이면
		//Student타입으로 형변환후 target에 대입
		if(obj instanceof Student target) {
			if(no==target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
	
	
}

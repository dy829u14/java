package day09.exam01;

public class ChildExam {

	public static void main(String[] args) {
		//클래스타입의 자동타입변환과 강제타입변환
		Parent parent1 = new Parent();
		Parent parent2 = new Child();
		Parent parent3 = new Child();
		Child child1 = new Child();
		
		//parent2는 parent타입으로 필드와 메소드를 사용할 수 있다
		parent2.field1 = "안녕";
//		parent2.field2 = "안녕";  //불가능
		
		//강제타입변환
		Child child2 = (Child) parent2;
//		Child child3 = (Child) parent1; //불가능
		child2.method3();
		child2.field2 = "하이";
		
		typeChange(parent1);
		typeChange(parent2);
		typeChange(parent3);
		
		//instanceof 연산자 
		//객체 instanceof 클래스타입
		System.out.println(parent2 instanceof Parent);
		
	}
	//Parent타입 객체를 전달받아 Child타입으로 강제타입전환을 하세요
	public static void typeChange(Parent parent) {
		//모든 parent타입을 강제타입변환 불가능
		//Child타입의 객체가 자동타입변환된 경우에만 강제타입변환 가능
		//Child타입인지 확인을 instanceof로 가능
		if(parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("강제타입변환됨");
		
		}
	}

}

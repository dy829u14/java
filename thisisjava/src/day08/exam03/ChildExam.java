package day08.exam03;

public class ChildExam {

	public static void main(String[] args) {
		// 자식 객체 생성
		Child child = new Child();
		
		//자동 타입 변환
		Parent parent = child;
		Parent parent2 = new Parent();
		parent.method1();  //자식메소드1
		parent2.method1();  //부모메소드1
		child.method3();
//		parent.method3();
//		자식타입 객체를 부모타입으로 자동변환했을때
//		부모타입의 메소드와 필드만 사용가능
//		이 때 자식 클래스에서 오버라이드한 메소드는 자식 메소드가 적용됨
		
		

	}

}

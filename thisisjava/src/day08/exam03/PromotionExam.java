package day08.exam03;
class A {
	
}
class B extends A {
	
}
class C extends A {
	
}
class D extends B {
	
}
class E extends C {
	
}
public class PromotionExam {
	
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a11 = new B();
		A a2 = c;
		A a3 = d;
		A a4 = e;
		//B b2 = new C();

	}

}

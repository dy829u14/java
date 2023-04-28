package day09.exam02;

public class AnimalExam {

	public static void main(String[] args) {
		Animal anicat = new Cat();
		Animal anidog = new Dog();
		
		anicat.sound();
		anidog.sound();
		typeChange(anidog);
		typeChange(anicat);

	}
	public static void typeChange(Animal ani) {
		if(ani instanceof Dog) {
			Dog dog = (Dog) ani;
			System.out.println("성공");
		}
		
	}

}

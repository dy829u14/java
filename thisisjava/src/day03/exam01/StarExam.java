package day03.exam01;

public class StarExam {

	public static void main(String[] args) {
		for(int i = 0; i<5; i++ ) {
			for(int j = 5; j>=0; j--) {
				if(i<j) {
					System.out.print(" ");
				}
				else {System.out.print("*");}
			}
			System.out.println();
		}
		
	}

}

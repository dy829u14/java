package day13.exam07;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		int randomNum = (int) (Math.random()*5)+1;  //1~5
		
		Random ra = new Random();
		int randomNum2 = ra.nextInt(5)+1;
		
		System.out.println(randomNum);
		System.out.println(randomNum2);
		
		Random ra1 = new Random(3);
		int[] randomNum3 = new int [5];
		for(int i=0; i<5; i++) {
			randomNum3[i] = ra1.nextInt(10);
		}
		for(int a: randomNum3) {
			System.out.println("배열요소의 값은 : "+a);
		}
		
		Random ra2 = new Random(3);
		int[] randomNum4 = new int [5];
		for(int i=0; i<5; i++) {
			randomNum4[i] = ra1.nextInt(10);
		}
		for(int a: randomNum4) {
			System.out.println("배열요소의 값은 : "+a);
		}
		
		

	}

}

package day07.exam01;

public class Computer {
	//메소드 선언
	int sum(int...values) {
		//sumNum변수선언
		int sumNum = 0;
		for(int i=0; i<values.length; i++) {
			sumNum += values[i];
		}
			return sumNum;
	}
	//메소드 오버로딩
	int add (int x ,int y) {
		return x+y;
	}
	double add (double x, double y) {
		return x+y;
	}
	//정사각형의 넓이
	double areaRectangle(double width) {
		return width*width;
	}
	double areaRectangle(double width, double height) {
		return width*height;
	}
}

package day07.quiz;

public class ShopServiceExam {

	public static void main(String[] args) {
		
		ShopService obj1 = ShopService.getInstadne();
		ShopService obj2 = ShopService.getInstadne();
		
		if(obj1==obj2) {
			System.out.println("같은 ShopService 객체입니다");
		}
		else {
			System.out.println("다른 ShopService 객체입니다");
		}

	}

}

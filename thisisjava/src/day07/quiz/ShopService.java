package day07.quiz;

public class ShopService {
	
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	//메소드
	public static ShopService getInstadne () {
		return shopService;
	}

}

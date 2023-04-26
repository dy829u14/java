package day07.quiz;

public class ShopService {
	
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstadne () {
		return singleton;
	}

}

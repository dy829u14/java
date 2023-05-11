package day17.coffee;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private static Menu instance = new Menu();
	private List<MenuItem> items;
	
	public static Menu getInstance() {
		return instance;
	}
	private Menu() {
		//싱글톤 패턴 : 객체를 하나만 생성
		items = new ArrayList<MenuItem>();
		items.add(new MenuItem("아메리카노", 1500));
		items.add(new MenuItem("카페모카", 2000));
		items.add(new MenuItem("허니자몽블랙티", 2500));
		items.add(new MenuItem("바닐라라떼", 2500));
		items.add(new MenuItem("녹차", 2000));
		items.add(new MenuItem("홍자", 2000));
	}
	public MenuItem choose(String menuName) {
		for(MenuItem menuItem : items) {
			if(menuItem.getName().equals(menuName)) {
				return menuItem;
			}
		}
		return null;
	}
}

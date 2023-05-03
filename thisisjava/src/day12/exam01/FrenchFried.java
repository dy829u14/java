package day12.exam01;

public class FrenchFried {
	private int price;
	private String desc;
	private FrenchFried() {
		this(1000, "감자튀김");
	}
	public FrenchFried(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}

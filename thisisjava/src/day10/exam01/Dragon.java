package day10.exam01;

public class Dragon implements Unit{
	String name;
	int hp;
	int attack;
	public Dragon(String name) {
		this(name,150,20);
	}
	public Dragon(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	@Override
	public int getAttack() {
		return attack;
	}
	@Override
	public int getHp() {
		return hp;
	}
	@Override
	public String getName() {		
		return name;
	}
	@Override
	public void setHp(int hp) {
		this.hp = hp;		
	}

}

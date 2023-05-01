package day10.exam01;

public class Hydra implements Unit{
	String name;
	int hp;
	int attack;
	public Hydra(String name) {
		this(name,75,15);
	}
	public Hydra(String name, int hp, int attack) {
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

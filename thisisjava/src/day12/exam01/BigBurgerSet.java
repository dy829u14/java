package day12.exam01;

public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private FrenchFried frenchFried;
	
	public BigBurgerSet(BigBurger bigBurger, Coke coke, FrenchFried frenchFried) {
		this.bigBurger = bigBurger;
		this.coke = coke;
		this.frenchFried = frenchFried;
	}

	public BigBurger getBigBurger() {
		return bigBurger;
	}

	public void setBigBurger(BigBurger bigBurger) {
		this.bigBurger = bigBurger;
	}

	public Coke getCoke() {
		return coke;
	}

	public void setCoke(Coke coke) {
		this.coke = coke;
	}

	public FrenchFried getFrenchFried() {
		return frenchFried;
	}

	public void setFrenchFried(FrenchFried frenchFried) {
		this.frenchFried = frenchFried;
	}
	
}

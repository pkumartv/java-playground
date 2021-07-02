package dp.decorator;

public class Whip extends CondimentsDecorator {

	Beverage beverage;
	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage= beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+ ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1+ beverage.cost();
	}

}

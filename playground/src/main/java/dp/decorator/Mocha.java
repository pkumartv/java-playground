	package dp.decorator;

public class Mocha extends CondimentsDecorator {
	Beverage beverage;

	
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+ ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .20+ beverage.cost();
	}

}

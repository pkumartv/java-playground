package dp.strategy;

public class MallardDuck extends Duck {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real mallard duck");
	}
	
	MallardDuck(){
		flyBehavior = new FlyWithWings();
	}

}

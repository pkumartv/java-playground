package dp.strategy;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public Duck(){
		
	}
	
	public void performFly(){
		flyBehavior.fly();
	}
	
	public abstract void display();
	
	public void swim(){
		System.out.println("All ducks float, even decoys");
	}
	
}

package dp.decorator;


//Abstract Component 
public abstract class Beverage {
	String description="Unknown Beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}

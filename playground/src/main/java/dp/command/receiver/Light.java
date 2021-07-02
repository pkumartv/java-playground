package dp.command.receiver;

public class Light {
	
	private String type="default";
	public Light() {
		// TODO Auto-generated constructor stub
	}
	
	public Light(String type){
		this.type=type;
	}
	
	public void on() {
		System.out.println(type+ " Light is on");
		
	}
	
	public void off() {
		System.out.println(type + " Light is off");
		
	}

}

package dp.command.receiver;

public interface GarageDoor {
	
	default void up() {
		System.out.println("Garage door up");
	}
	default void down() {
		System.out.println("Garage door down");
	}
	default void stop() {
		System.out.println("Garage door stopped");
	}
	default void lightOn() {
		System.out.println("Garage door light on");
	}
	static void lightOff() {
		System.out.println("Garage door light on");
	}

}

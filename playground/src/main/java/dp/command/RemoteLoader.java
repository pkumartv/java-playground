package dp.command;

import dp.command.concretecommand.GarageDoorOpenCommand;
import dp.command.concretecommand.LightOnCommand;
import dp.command.receiver.GarageDoor;
import dp.command.receiver.Light;
import dp.command.remote.SimpleRemoteControl;

public class RemoteLoader {

	public static void main(String[] args) {
		SimpleRemoteControl remote= new SimpleRemoteControl();
		Light lightOn= new Light();
		GarageDoor door = new GarageDoor() {
		};
		
		
		
		LightOnCommand command = new LightOnCommand(lightOn);
		GarageDoorOpenCommand garageDoor= new GarageDoorOpenCommand(door); 
		remote.setCommand(command);
		remote.buttonWasPressed();
		remote.setCommand(garageDoor);
		remote.buttonWasPressed();

	}

}

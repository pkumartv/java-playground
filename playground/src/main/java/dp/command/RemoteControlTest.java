package dp.command;

import dp.command.remote.RemoteControl;
import dp.command.concretecommand.GarageDoorCloseCommand;
import dp.command.concretecommand.GarageDoorOpenCommand;
import dp.command.concretecommand.LightOffCommand;
import dp.command.concretecommand.LightOnCommand;
import dp.command.receiver.GarageDoor;
import dp.command.receiver.Light;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		//Application
		RemoteControl remote= new RemoteControl();
		
		//Receivers
		Light livingRoomLight= new Light("Living Room");
		Light kitchenLight= new Light("Kitchen");
		GarageDoor door = new GarageDoor() {
		};
		
		
		//Concrete Commands
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
		
		GarageDoorOpenCommand garageDoorOpenCommand= new GarageDoorOpenCommand(door);
		GarageDoorCloseCommand garageDoorCloseCommand= new GarageDoorCloseCommand(door);
		
		
		LightOnCommand kitchenLightOn= new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		remote.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remote.setCommand(1, garageDoorOpenCommand, garageDoorCloseCommand);
		remote.setCommand(3, kitchenLightOn, kitchenLightOff);

	
		System.out.println(remote);
		
		remote.onButtonWasPushed(0);
		remote.offButtonWasPushed(0);
		remote.onButtonWasPushed(1);
		remote.offButtonWasPushed(1);
		remote.offButtonWasPushed(5);
		remote.onButtonWasPushed(3);
		remote.offButtonWasPushed(3);
		

	}

}

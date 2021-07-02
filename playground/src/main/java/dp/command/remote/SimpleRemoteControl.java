package dp.command.remote;

import dp.command.Command;

public class SimpleRemoteControl {
	Command slot;
	

	public SimpleRemoteControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setCommand(Command cmd) {
		slot=cmd;

	}
	
	public void buttonWasPressed() {
		slot.execute();

	}
	
	
}

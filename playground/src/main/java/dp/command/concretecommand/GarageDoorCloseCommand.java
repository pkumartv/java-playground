package dp.command.concretecommand;

import dp.command.Command;
import dp.command.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command {

	GarageDoor door;
	
	public GarageDoorCloseCommand(GarageDoor door) {
		this.door=door;
	}
	@Override
	public void execute() {
		door.down();
	}

}

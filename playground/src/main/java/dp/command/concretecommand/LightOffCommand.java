package dp.command.concretecommand;

import dp.command.Command;
import dp.command.receiver.Light;

public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light) {
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.off();

	}

}

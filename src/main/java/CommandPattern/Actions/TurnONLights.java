package CommandPattern.Actions;

import CommandPattern.Command;
import CommandPattern.models.Light;

public class TurnONLights implements Command {

    Light light;

    public TurnONLights(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
        light.turnONtheLight();
    }
}

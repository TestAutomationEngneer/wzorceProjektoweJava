package CommandPatternLAMBDA.Actions;

import CommandPatternLAMBDA.Command;
import CommandPatternLAMBDA.models.Light;

public class TurnOFFLights implements Command {

    Light light;

    public TurnOFFLights(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
        light.turnOFFtheLight();
    }
}

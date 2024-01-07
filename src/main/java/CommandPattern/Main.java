package CommandPattern;

import CommandPattern.Actions.TurnOFFLights;
import CommandPattern.Actions.TurnOFFMusic;
import CommandPattern.Actions.TurnONLights;
import CommandPattern.Actions.TurnONMusic;
import CommandPattern.models.Light;
import CommandPattern.models.Music;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        Light light = new Light();
        Music music = new Music();

        //lights
        TurnOFFLights turnOFFLights = new TurnOFFLights(light);
        TurnONLights turnONLights = new TurnONLights(light);

        //music
        TurnONMusic turnONMusic = new TurnONMusic(music);
        TurnOFFMusic turnOFFMusic = new TurnOFFMusic(music);

        //impreza start
        pilot.setCommand(turnONLights);
        pilot.pressTheButtonOnPilot();

        pilot.setCommand(turnONMusic);
        pilot.pressTheButtonOnPilot();

        //koniec imprezy
        pilot.setCommand(turnOFFMusic);
        pilot.pressTheButtonOnPilot();

        pilot.setCommand(turnOFFLights);
        pilot.pressTheButtonOnPilot();


    }
}

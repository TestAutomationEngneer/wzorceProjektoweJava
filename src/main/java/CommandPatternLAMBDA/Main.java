package CommandPatternLAMBDA;

import CommandPatternLAMBDA.Actions.TurnOFFLights;
import CommandPatternLAMBDA.Actions.TurnOFFMusic;
import CommandPatternLAMBDA.Actions.TurnONLights;
import CommandPatternLAMBDA.Actions.TurnONMusic;
import CommandPatternLAMBDA.models.Light;
import CommandPatternLAMBDA.models.Music;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();
        Light light = new Light();
        Music music = new Music();

//        //lights
//        TurnOFFLights turnOFFLights = new TurnOFFLights(light);
//        TurnONLights turnONLights = new TurnONLights(light);
//
//        //music
//        TurnONMusic turnONMusic = new TurnONMusic(music);
//        TurnOFFMusic turnOFFMusic = new TurnOFFMusic(music);

        //impreza start
        pilot.setCommand(() -> light.turnONtheLight());
        //pilot.setCommand(() -> light::turnONtheLight);

        pilot.pressTheButtonOnPilot();

        pilot.setCommand(() -> music.turnONtheMusic());
        pilot.pressTheButtonOnPilot();

        //koniec imprezy
        pilot.setCommand(() -> light.turnOFFtheLight());
        pilot.pressTheButtonOnPilot();

        pilot.setCommand(() -> music.turnOFFtheMusic());
        pilot.pressTheButtonOnPilot();


    }
}

package CommandPatternLAMBDA.Actions;

import CommandPatternLAMBDA.Command;
import CommandPatternLAMBDA.models.Music;

public class TurnOFFMusic implements Command {

    Music music;

    public TurnOFFMusic(Music music) {
        this.music = music;
    }

    @Override
    public void doAction() {
        music.turnOFFtheMusic();
    }
}

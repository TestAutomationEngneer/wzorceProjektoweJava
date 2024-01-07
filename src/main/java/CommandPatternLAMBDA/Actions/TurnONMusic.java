package CommandPatternLAMBDA.Actions;

import CommandPatternLAMBDA.Command;
import CommandPatternLAMBDA.models.Music;

public class TurnONMusic implements Command {

    Music music;

    public TurnONMusic(Music music) {
        this.music = music;
    }

    @Override
    public void doAction() {
        music.turnONtheMusic();
    }
}

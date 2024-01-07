package CommandPattern.Actions;

import CommandPattern.Command;
import CommandPattern.models.Music;

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

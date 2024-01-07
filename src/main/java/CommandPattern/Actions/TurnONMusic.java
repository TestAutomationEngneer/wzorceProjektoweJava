package CommandPattern.Actions;

import CommandPattern.Command;
import CommandPattern.models.Music;

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

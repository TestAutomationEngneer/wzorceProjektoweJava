package CommandPattern;

public class Pilot {

    Command command;

    public Pilot() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressTheButtonOnPilot() {
        command.doAction();
    }
}

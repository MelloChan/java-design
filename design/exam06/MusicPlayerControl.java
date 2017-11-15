package design.exam06;

/**
 * 控制器
 * Created by MelloChan on 2017/11/15.
 */
public class MusicPlayerControl {
    private Command command;

    public void setMusicPlayerControl(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}

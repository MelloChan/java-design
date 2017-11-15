package design.exam06;

/**
 * 暂停
 * Created by MelloChan on 2017/9/14.
 */
public class MusicStopCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicStopCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stop();
    }
}

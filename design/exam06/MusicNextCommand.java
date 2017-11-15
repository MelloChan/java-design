package design.exam06;

/**
 * 下一首
 * Created by MelloChan on 2017/11/15.
 */
public class MusicNextCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicNextCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.next();
    }
}

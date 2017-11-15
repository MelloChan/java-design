package design.exam06;

/**
 * 上一首
 * Created by MelloChan on 2017/11/15.
 */
public class MusicPreviousCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPreviousCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.previous();
    }
}

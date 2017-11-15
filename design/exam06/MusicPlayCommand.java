package design.exam06;

/**
 * 播放
 * Created by MelloChan on 2017/11/15.
 */
public class MusicPlayCommand implements Command {
    private MusicPlayer musicPlayer;

    public MusicPlayCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.play();
    }
}

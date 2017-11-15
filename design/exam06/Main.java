package design.exam06;

/**
 * 测试类
 * Created by MelloChan on 2017/11/15.
 */
public class Main {
    public static void main(String[] args) {
        MusicPlayerControl musicPlayerControl=new MusicPlayerControl();
        MusicPlayer musicPlayer=new MusicPlayer();

        Command command=new MusicPlayCommand(musicPlayer);
        musicPlayerControl.setMusicPlayerControl(command);
        musicPlayerControl.buttonWasPressed();
        System.out.println("===========================");
        command=new MusicStopCommand(musicPlayer);
        musicPlayerControl.setMusicPlayerControl(command);
        musicPlayerControl.buttonWasPressed();
        System.out.println("===========================");
        command=new MusicPreviousCommand(musicPlayer); //上一首
        musicPlayerControl.setMusicPlayerControl(command);
        musicPlayerControl.buttonWasPressed();
        System.out.println("===========================");
        command=new MusicNextCommand(musicPlayer);  //下一首
        musicPlayerControl.setMusicPlayerControl(command);
        musicPlayerControl.buttonWasPressed();
        System.out.println("===========================");
        command=new MusicPreviousCommand(musicPlayer); //上一首
        musicPlayerControl.setMusicPlayerControl(command);
        musicPlayerControl.buttonWasPressed();

    }
}

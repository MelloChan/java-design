package design.exam06;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 音乐播放器
 * Created by MelloChan on 2017/11/15.
 */
public class MusicPlayer {
    private  final AtomicInteger id=new AtomicInteger(1);
    void play() {
        System.out.println("音乐播放.");
    }

    void previous() {
        if(id.get()==1){
            System.out.println("当前播放曲目为第一首.");
        }else{
            id.getAndDecrement();
            System.out.println("播放第"+id.get()+"首歌曲.");
        }
    }

    void next() {
        id.getAndIncrement();
        System.out.println("播放第"+id.get()+"首歌曲.");
    }

    void stop() {
        System.out.println("音乐暂停.");
    }
}

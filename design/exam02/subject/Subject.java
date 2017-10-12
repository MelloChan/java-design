package design.exam02.subject;

import design.exam02.obverse.Observer;

/**
 * 主题接口
 * Created by Administrator on 2017/10/12.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();


}

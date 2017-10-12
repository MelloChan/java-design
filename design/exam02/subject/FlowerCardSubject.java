package design.exam02.subject;


import design.exam02.domain.Custom;
import design.exam02.obverse.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 购花网站主题实现类
 * Created by Administrator on 2017/10/12.
 */
public class FlowerCardSubject implements Subject {
    private List<Observer> observers;
    private Custom custom;

    public FlowerCardSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(custom);
        }
    }

    private void customChanged() {
        notifyObserver();
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
        customChanged();
    }
}

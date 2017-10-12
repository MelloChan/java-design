package design.exam02;


import design.exam02.domain.Custom;
import design.exam02.obverse.NewMessagePushBehavior;
import design.exam02.obverse.RegisterBehavior;
import design.exam02.subject.FlowerCardSubject;

/**
 * 测试客户端类
 * [单元测试就省了]
 * Created by MelloChan on 2017/10/12.
 */
public class Main {
    public static void main(String[] args) {
        FlowerCardSubject subject = new FlowerCardSubject();

        RegisterBehavior registerBehavior = new RegisterBehavior(subject);
        NewMessagePushBehavior newMessagePushBehavior = new NewMessagePushBehavior(subject);

        Custom c1 = new Custom("mello", "mellochan@sina.cn", true, true);
        Custom c2 = new Custom("yuki", "yuki@sina.cn", true, true);

        subject.setCustom(c1);
        subject.setCustom(c2);

        newMessagePushBehavior.cancel(c1);
        subject.setCustom(c1);
        subject.setCustom(c2);
    }
}

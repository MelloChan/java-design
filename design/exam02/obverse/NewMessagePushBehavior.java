package design.exam02.obverse;


import design.exam02.domain.Custom;
import design.exam02.subject.Subject;

/**
 * 新商品上线消息推送实现类
 * Created by Administrator on 2017/10/12.
 */
public class NewMessagePushBehavior implements Observer, EmailElement {
    private Subject flowerCardSubject;
    private Custom custom;

    public NewMessagePushBehavior(Subject flowerCardSubject) {
        this.flowerCardSubject = flowerCardSubject;
        flowerCardSubject.registerObserver(this);
    }

    @Override
    public void sendEmail() {
        if (custom.getFlag()) {
            System.out.println(custom.getUsername() + ":新商品上线，请您查收！\n");
        }
    }

    @Override
    public void update(Custom custom) {
        this.custom = custom;
        sendEmail();
    }

    /**
     * 取消订阅新商品消息
     *
     * @param custom 消费者实体引用
     */
    public void cancel(Custom custom) {
        System.out.println(custom.getUsername() + ":成功取消新商品通知!\n");
        custom.setFlag(false);
    }
}

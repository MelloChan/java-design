package design.exam02.obverse;


import design.exam02.domain.Custom;
import design.exam02.subject.Subject;

/**
 * 新用户注册实现类
 * Created by Administrator on 2017/10/12.
 */
public class RegisterBehavior implements Observer, EmailElement {
    private Subject flowerCardSubject;
    private Custom custom;

    public RegisterBehavior(Subject flowerCardSubject) {
        this.flowerCardSubject = flowerCardSubject;
        flowerCardSubject.registerObserver(this);
    }

    @Override
    public void sendEmail() {
        if (custom.getRegister()) {
            System.out.println(custom.getUsername() + ":感谢注册购花网站，欢迎您的到来!\n");
            custom.setRegister(false);
        }
    }

    @Override
    public void update(Custom custom) {
        this.custom = custom;
        sendEmail();
    }
}

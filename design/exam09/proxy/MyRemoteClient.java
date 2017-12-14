package design.exam09.proxy;

import java.rmi.Naming;

/**
 * 客户端调用
 * Created by MelloChan on 2017/12/14.
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    private void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://localhost/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

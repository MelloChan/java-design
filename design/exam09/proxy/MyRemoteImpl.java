package design.exam09.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 用于生成 Stub && Skel 字节码文件
 * Created by MelloChan on 2017/12/14.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says,'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello",service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

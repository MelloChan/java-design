package design.exam09.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 代理接口
 * Created by MelloChan on 2017/12/14.
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}

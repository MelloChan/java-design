package design.exam09.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by MelloChan on 2017/12/7.
 */
public class OwnerInvacationHandler implements InvocationHandler {
    private Person person;

    public OwnerInvacationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalArgumentException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}

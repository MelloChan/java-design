package design.exam09;

import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by MelloChan on 2017/12/7.
 */
public class Main {
    private ConcurrentHashMap<String,Person> concurrentHashMap=new ConcurrentHashMap<>();
    public static void main(String[] args) {
        Main main=new Main();
        main.drive();
    }
    public Main(){
        init();
    }
    public void drive(){
        Person joe = getPerson("Joe Javabean");
        Person ownerProxy = getOwnerProxy(joe);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("bowling, Go");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        Person nonOwnerProxy = getNonOwnerProxy(joe);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("bowling, Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());

    }
    Person getOwnerProxy(Person person){
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvacationHandler(person)
        );
    }
    Person getNonOwnerProxy(Person person){
        return (Person)Proxy.newProxyInstance(
          person.getClass().getClassLoader(),
          person.getClass().getInterfaces(),
          new NonOwnerInvocationHandler(person)
        );
    }
    Person getPerson(String key){
        return concurrentHashMap.get(key);
    }
    public void init(){
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setHotOrNotRating(7);
        concurrentHashMap.put(joe.getName(), joe);

        Person kelly = new PersonImpl();
        kelly.setName("Kelly Klosure");
        kelly.setInterests("ebay, movies, music");
        kelly.setHotOrNotRating(6);
        concurrentHashMap.put(kelly.getName(), kelly);
    }
}

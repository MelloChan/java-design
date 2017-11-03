package design.exam05;

/**
 * 客户端类
 * Created by MelloChan on 2017/10/29.
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                BaseInfo baseInfo=new BaseInfo("15","20","10","02");
                String no=IDGenerator.getInstance().createStuId(baseInfo);
                System.out.println(no);
            }).start();
        }
    }
}

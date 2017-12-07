package design.exam08;

/**
 * 状态模式
 * Created by MelloChan on 2017/12/7.
 */
public class Main {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.loan();
        System.out.println(library);
        library.exist();
        System.out.println(library);
        System.out.println("-------------------------------------");
        library.loan();
        library.loan();
        System.out.println(library);
        library.exist();
        library.exist();
        System.out.println(library);
    }
}

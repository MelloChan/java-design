package design.exam08;

/**
 * 借出状态
 * 只允许调用返书方法,禁止调用借书方法!
 * Created by MelloChan on 2017/12/7.
 */
public class LoanState implements State {
    private Library library;

    public LoanState(Library library) {
        this.library = library;
    }

    @Override
    public void exist() {
        System.out.println("Luck! The book is existed now!");
        library.returnBook();
        library.setState(library.getExistState());
    }

    @Override
    public void loan() {
        System.out.println("Sorry!");
    }
}

package design.exam08;

/**
 * 在馆状态
 * 只能调用借书方法,禁止调用返书方法
 * Created by MelloChan on 2017/12/7.
 */
public class ExistState implements State {
    private Library library;

    public ExistState(Library library) {
        this.library = library;
    }

    @Override
    public void exist() {
        System.out.println("Sorry! The book is existed!");
    }

    @Override
    public void loan() {
        System.out.println("Luck! The book is existed!");
        library.loanBook();
        library.setState(library.getLoanState());
    }
}

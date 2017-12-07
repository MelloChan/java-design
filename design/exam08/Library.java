package design.exam08;

/**
 * 图书馆实体类
 * Created by MelloChan on 2017/12/7.
 */
public class Library {
    private State existState;
    private State loanState;
    private State state;
    private int count;

    public Library(int count) {
        this.count = count;
        existState = new ExistState(this);
        loanState = new LoanState(this);
        if (count > 0) {
            state = existState;
        } else {
            state = loanState;
        }
    }

    public void exist() {
        state.exist();
    }

    public void loan() {
        state.loan();
    }

    public State getExistState() {
        return existState;
    }

    public void setExistState(State existState) {
        this.existState = existState;
    }

    public State getLoanState() {
        return loanState;
    }

    public void setLoanState(State loanState) {
        this.loanState = loanState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        if (count >= 0) {
            return count;
        } else {
            return 0;
        }
    }

    public void loanBook() {
        if (count > 0) {
            --count;
        }
    }

    public void returnBook() {
        ++count;
    }

    @Override
    public String toString() {
        return "Library{" +
                "existState=" + existState +
                ", loanState=" + loanState +
                ", state=" + state +
                ", count=" + count +
                '}';
    }
}

package design.exam09.dynamic;

/**
 * Person
 * Created by MelloChan on 2017/12/7.
 */
public interface Person {
    String getName();
    String getGender();
    String getInterests();
    int getHotOrNotRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setHotOrNotRating(int rating);
}

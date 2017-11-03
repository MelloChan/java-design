package design.exam05;

/**
 * 基础信息
 * Created by MelloChan on 2017/10/29.
 */
public class BaseInfo {
    private String year;
    private String collage;
    private String preCode;
    private String classCode;

    public BaseInfo(String year, String collage, String preCode, String classCode) {
        this.year = year;
        this.collage = collage;
        this.preCode = preCode;
        this.classCode = classCode;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getPreCode() {
        return preCode;
    }

    public void setPreCode(String preCode) {
        this.preCode = preCode;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    @Override
    public String toString() {
        return "BaseInfo{" +
                "year='" + year + '\'' +
                ", collage='" + collage + '\'' +
                ", preCode='" + preCode + '\'' +
                ", classCode='" + classCode + '\'' +
                '}';
    }
}
//入学学年（2位）+学院代码（2位）+专业代码（2位）+班级代码（2位）+序号（2位）

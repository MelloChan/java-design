package design.exam02.domain;

/**
 * 消费者实体类
 * Created by Administrator on 2017/10/12.
 */
public class Custom {
    //用户名
    private String username;
    //邮箱
    private String email;
    //注册标识
    private Boolean register;
    //新商品推送标识
    private Boolean flag;

    public Custom(String username, String email, Boolean register, Boolean flag) {
        this.username = username;
        this.email = email;
        this.register = register;
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Boolean getRegister() {
        return register;
    }

    public void setRegister(Boolean register) {
        this.register = register;
    }

    @Override
    public String toString() {
        return "Custom{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", register=" + register +
                ", flag=" + flag +
                '}';
    }
}

package Pojo;

import java.io.Serializable;

public class User implements Serializable {
    private String account;
    private String pwd;
    private String username;
    private Integer vip;

    public User(String account, String pwd, String username, Integer vip) {
        this.account = account;
        this.pwd = pwd;
        this.username = username;
        this.vip = vip;
    }

    public String getAccount() {

        return account;
    }

    public void setAccount(String account) {

        this.account = account;
    }

    public String getPwd() {

        return pwd;
    }

    public void setPwd(String pwd) {

        this.pwd = pwd;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getVip() {

        return vip;
    }

    public void setVip(Integer vip) {

        this.vip = vip;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", pwd='" + pwd + '\'' +
                ", username='" + username + '\'' +
                ", vip=" + vip +
                '}';
    }
}

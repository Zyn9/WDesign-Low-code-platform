package Pojo;

import java.io.Serializable;

public class Project implements Serializable {
    private Integer id;
    private String Name;
    private String account;
    private String filepath;
    private Long createTime;
    private Long modifyTime;
    private String isLive;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getIsLive() {
        return isLive;
    }

    public void setIsLive(String isLive) {
        this.isLive = isLive;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", account='" + account + '\'' +
                ", filepath=" + filepath +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", isLive='" + isLive + '\'' +
                '}';
    }

    public Project(Integer id, String Name, String account, String filepath, Long createTime, Long modifyTime, String isLive) {
        this.id = id;
        this.Name = Name;
        this.account = account;
        this.filepath = filepath;
        this.createTime = createTime;
        this.modifyTime = modifyTime;
            this.isLive = isLive;

    }

}

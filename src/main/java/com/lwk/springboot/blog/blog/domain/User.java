package com.lwk.springboot.blog.blog.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * user实体
 *
 */
@Entity  //实体
public class User implements Serializable {
    /**
     * 唯一标识
     */
    @Id  //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //自增长策略
    private int userId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private boolean sex;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 登录账号
     */
    private  String accountName;
    /**
     * 密码
     */
    private String password;
    /**
     * 头像
     */
    private  String  avatar;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

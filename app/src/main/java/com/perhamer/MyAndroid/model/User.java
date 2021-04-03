package com.perhamer.MyAndroid.model;

import java.io.Serializable;

/**
 * @Author Perhamer
 * @Date 2021/4/3
 */
public class User implements Serializable {

    private static final long serialVersionUID = -7345549004119409741L;

    private String id;

    private String userName;

    private String password;

    private String salt;

    /**
     * 头像
     */
    private byte[] headImg;


    /**
     * 用户来源
     */
    private Integer userSource;

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }

    public Integer getUserSource() {
        return userSource;
    }

    public void setUserSource(Integer userSource) {
        this.userSource = userSource;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", userSource=" + userSource +
                '}';
    }
}

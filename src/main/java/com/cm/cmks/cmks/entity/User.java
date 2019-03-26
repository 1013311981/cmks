package com.cm.cmks.cmks.entity;

import lombok.Data;

/**
 * 包名: com.cm.cmks.cmks.entity
 * 作者: Lx
 * 日期: 2019/3/26 20:51
 */
@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String name;
    private String mobile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

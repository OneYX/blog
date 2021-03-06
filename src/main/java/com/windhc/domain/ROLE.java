package com.windhc.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by HC on 2016/6/19.
 */
public class Role {

    @Id
    @GeneratedValue(generator = "JDBC")
    private long roleId;
    private String name;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

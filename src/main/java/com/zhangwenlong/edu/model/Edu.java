package com.zhangwenlong.edu.model;

import java.util.Date;

public class Edu {
    private int Id;
    private String name;
    private Date CreateTime;

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public Edu(int id, String name, Date createTime) {
        Id = id;
        this.name = name;
        CreateTime = createTime;
    }
}

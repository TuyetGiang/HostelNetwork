package com.giang.service.dto;

import java.io.Serializable;

public class TypeDTO implements Serializable {
    private Integer id;

    private String typeName;

    private String despription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDespription() {
        return despription;
    }

    public void setDespription(String despription) {
        this.despription = despription;
    }
}

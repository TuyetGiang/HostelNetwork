package com.giang.service.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class ApartmentDTO implements Serializable {
    private Integer id;

    private Integer typeId;

    private String location;

    private Double priceAvg;

    private Integer hostId;

    private Integer brandId;

    private LocalDate registDate;

    private Boolean isBlocked;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPriceAvg() {
        return priceAvg;
    }

    public void setPriceAvg(Double priceAvg) {
        this.priceAvg = priceAvg;
    }

    public Integer getHostId() {
        return hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public LocalDate getRegistDate() {
        return registDate;
    }

    public void setRegistDate(LocalDate registDate) {
        this.registDate = registDate;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }
}

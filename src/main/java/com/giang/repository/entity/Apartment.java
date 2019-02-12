package com.giang.repository.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "type_id")
    private Integer typeId;

    @Column(name = "location")
    private String location;

    @Column(name = "price_avg")
    private Double priceAvg;

    @Column(name = "host_id")
    private Integer hostId;

    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "regist_date")
    private LocalDate registDate;

    @Column(name = "is_blocked")
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

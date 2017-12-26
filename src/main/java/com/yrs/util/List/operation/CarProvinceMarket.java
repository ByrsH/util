package com.yrs.util.List.operation;

/**
 * @Author: yrs
 * @Description:各省行情类
 * @Date: Greated in 21:49 2017/12/21
 * @Modified By:
 */
public class CarProvinceMarket {
    private Integer id;
    private Integer carId;
    private Integer provinceId;
    private Double price;
    private Integer createdBy;

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

package com.vehicle.dto.request;


import java.math.BigDecimal;

import com.vehicle.enums.SparePartStatus;

public class SparePartRequestDTO {

    private String partName;
    private String partCode;
    private String category;
    private Integer quantity;
    private BigDecimal price;
    private SparePartStatus status;

    public SparePartRequestDTO() {}

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getPartCode() {
        return partCode;
    }

    public void setPartCode(String partCode) {
        this.partCode = partCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public SparePartStatus getStatus() {
        return status;
    }

    public void setStatus(SparePartStatus status) {
        this.status = status;
    }
}

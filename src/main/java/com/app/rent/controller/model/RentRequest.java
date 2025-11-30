package com.app.rent.controller.model;

import com.app.rent.model.good.IProperty;

public class RentRequest {
    int renterId;
    IProperty property;

    public RentRequest(){}

    public RentRequest(int renterId,IProperty property) {
        this.renterId = renterId;
        this.property = property;
    }
    public IProperty getProperty() {
        return this.property;
    }
    public int getRenterId() {
        return this.renterId;
    }
}

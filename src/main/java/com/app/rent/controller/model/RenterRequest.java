package com.app.rent.controller.model;

import com.app.rent.model.rent.IRent;


public class RenterRequest {
    private IRent renter;

    public RenterRequest(IRent renter){
        this.renter = renter;
    }
    public IRent getRenter() {
        return renter;
    }
}

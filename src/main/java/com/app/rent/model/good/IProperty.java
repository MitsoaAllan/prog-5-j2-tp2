package com.app.rent.model.good;

public interface IProperty {
    int getId();
    String getName();
    String getDescription();
    double getPrice();
    PropertyStatus getStatus();
}
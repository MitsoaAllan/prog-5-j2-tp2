package com.app.rent.model.rent;


import com.app.rent.model.good.Property;
import com.app.rent.model.good.PropertyStatus;

import java.util.HashSet;
import java.util.Set;

public abstract class Renter implements IRent{
    protected int id;
    protected String addréss;
    protected String phone;
    protected String email;
    protected Set<Property> properties;

    public Renter(int id, String address, String phone, String email) {
        this.id = id;
        this.addréss = address;
        this.phone = phone;
        this.email = email;
        this.properties = new HashSet<>();
    }

    public int getId() { return id; }
    public String getAddréss() { return addréss; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public Set<Property> getProperties() { return properties; }

    public abstract RenterType getType();

    @Override
    public Boolean rent(Property property) {
        if (property.getStatus() == PropertyStatus.RENTED) {
            return false;
        }
        this.properties.add(property);
        property.setStatus(PropertyStatus.RENTED);
        return true;
    }
}


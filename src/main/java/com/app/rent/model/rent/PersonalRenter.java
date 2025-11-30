package com.app.rent.model.rent;


public class PersonalRenter extends Renter {
    private String firstName;
    private String lastName;

    public PersonalRenter(int id, String address, String phone, String email,
                          String firstName, String lastName) {
        super(id, address, phone, email);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public RenterType getType() {
        return RenterType.PERSONAL;
    }

    @Override
    public String toString() {
        return "PersonalRenter: " + firstName + " " + lastName;
    }
}


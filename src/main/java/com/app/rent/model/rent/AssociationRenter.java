package com.app.rent.model.rent;


public class AssociationRenter extends Renter {
    private String associationName;
    private String registrationNo;

    public AssociationRenter(int id, String address, String phone, String email,
                             String associationName, String registrationNo) {
        super(id, address, phone, email);
        this.associationName = associationName;
        this.registrationNo = registrationNo;
    }

    @Override
    public RenterType getType() {
        return RenterType.ASSOCIATION;
    }

    @Override
    public String toString() {
        return "AssociationRenter: " + associationName;
    }
}


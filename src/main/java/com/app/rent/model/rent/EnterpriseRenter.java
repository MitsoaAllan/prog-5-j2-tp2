package com.app.rent.model.rent;


public class EnterpriseRenter extends Renter {
    private String companyName;
    private String taxId;
    private String contactPerson;

    public EnterpriseRenter(int id, String address, String phone, String email,
                            String companyName, String taxId, String contactPerson) {
        super(id, address, phone, email);
        this.companyName = companyName;
        this.taxId = taxId;
        this.contactPerson = contactPerson;
    }

    @Override
    public RenterType getType() {
        return RenterType.ENTERPRISE;
    }

    @Override
    public String toString() {
        return "EnterpriseRenter: " + companyName;
    }
}


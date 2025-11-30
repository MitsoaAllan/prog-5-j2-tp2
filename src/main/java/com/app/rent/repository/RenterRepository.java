package com.app.rent.repository;

import com.app.rent.model.rent.IRent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RenterRepository {
    private final List<IRent> renters = new ArrayList<>();

    public void save(IRent renter) {
        renters.add(renter);
    }

    public IRent findById(int id) {
        return renters.stream().filter(r -> r.getId() == id).findFirst().orElse(null);
    }

    public List<IRent> findAll() {
        return renters;
    }
}

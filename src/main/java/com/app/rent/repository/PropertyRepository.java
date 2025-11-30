package com.app.rent.repository;

import com.app.rent.model.good.Property;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PropertyRepository {
    private final List<Property> properties = new ArrayList<>();

    public void save(Property property) {
        properties.add(property);
    }

    public Property findById(int id) {
        return properties.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public List<Property> findAll() {
        return properties;
    }
}

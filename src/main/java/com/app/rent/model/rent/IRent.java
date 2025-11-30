package com.app.rent.model.rent;

import com.app.rent.model.good.Property;

public interface IRent {
    int getId();
    Boolean rent(Property property);
}

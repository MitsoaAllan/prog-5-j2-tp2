package com.app.rent.service;

import com.app.rent.model.good.IProperty;
import com.app.rent.model.good.PropertyStatus;
import com.app.rent.model.rent.IRent;
import com.app.rent.repository.PropertyRepository;
import com.app.rent.repository.RenterRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class RentalService {
    private static Logger logger = LoggerFactory.getLogger(RentalService.class.getName());
    private final PropertyRepository propertyRepo;
    private final RenterRepository  renterRepo;

    public RentalService(PropertyRepository repo, RenterRepository renterRepo) {
        this.propertyRepo = repo;
        this.renterRepo = renterRepo;
    }

    public boolean rentProperty(int renterId,IProperty property) {
        var actualProperty = propertyRepo.findById(property.getId());
        logger.info("Trying to rent property "+property.getName());
        var actualRenter = renterRepo.findById(renterId);
        if (actualProperty == null) {
            logger.warn("Property "+property.getName()+" not found");
            return false;
        }

        if (actualProperty.getStatus() != PropertyStatus.AVAILABLE) {
            logger.warn("Property "+property.getName()+" not available");
            return false;
        }
        actualRenter.rent(actualProperty);
        actualProperty.setStatus(PropertyStatus.RENTED);
        return true;
    }

    public void saveRenter(IRent renter) {
         renterRepo.save(renter);
    }
}

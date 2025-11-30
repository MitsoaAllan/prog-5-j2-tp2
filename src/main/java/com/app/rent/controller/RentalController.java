package com.app.rent.controller;

import com.app.rent.controller.model.RentRequest;
import com.app.rent.controller.model.RenterRequest;
import com.app.rent.service.RentalService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentalController {
    private final RentalService rentalService;

    public RentalController(RentalService service) {
        this.rentalService = service;
    }

    @GetMapping("/ping")
    public String health(){
        return "pong";
    }

    @PostMapping("/{renterId}/rent")
    public ResponseEntity<Object> rent(RentRequest rentRequest) {
        boolean response = rentalService.rentProperty(rentRequest.getRenterId(),rentRequest.getProperty());
        if (response){
            return ResponseEntity.status(HttpStatus.OK).body(rentRequest);
        }
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Property is not for rent");
    }

    @PostMapping("/renter")
    public void saveRenter(RenterRequest renter) {
        rentalService.saveRenter(renter.getRenter());
    }
}

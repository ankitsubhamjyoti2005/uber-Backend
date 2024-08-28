package com.uber.app.strategies.impli;

import com.uber.app.entities.Driver;
import com.uber.app.entities.RideRequest;
import com.uber.app.repositories.DriverRepository;
import com.uber.app.strategies.DriverMatcheStratiges;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchesHighestRatedDriver implements DriverMatcheStratiges {

     private DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchesDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearbyTopRatedDrivers(rideRequest.getPickUpLocation());
    }
}

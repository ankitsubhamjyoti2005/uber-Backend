package com.uber.app.strategies.impli;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.entities.Driver;
import com.uber.app.entities.RideRequest;
import com.uber.app.repositories.DriverRepository;
import com.uber.app.strategies.DriverMatcheStratiges;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DriveMatchingNearestDriverStratigies implements DriverMatcheStratiges {

    private final DriverRepository driverRepository;
    @Override
    public List<Driver> findMatchesDriver(RideRequest rideRequest) {
        return driverRepository.findTenNearestDrivers(rideRequest.getPickUpLocation());
    }
}

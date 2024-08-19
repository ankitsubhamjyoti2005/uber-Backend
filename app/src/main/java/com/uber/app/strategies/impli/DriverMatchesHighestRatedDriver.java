package com.uber.app.strategies.impli;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.entities.Driver;
import com.uber.app.entities.RideRequest;
import com.uber.app.strategies.DriverMatcheStratiges;

import java.util.List;

public class DriverMatchesHighestRatedDriver implements DriverMatcheStratiges {
    @Override
    public List<Driver> findMatchesDriver(RideRequest rideRequest) {
        return List.of();
    }
}

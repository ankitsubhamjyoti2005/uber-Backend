package com.uber.app.strategies;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.entities.Driver;
import com.uber.app.entities.RideRequest;

import java.util.List;

public interface DriverMatcheStratiges {
    List<Driver> findMatchesDriver(RideRequest rideRequest);
}

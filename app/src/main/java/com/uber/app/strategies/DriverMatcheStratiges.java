package com.uber.app.strategies;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.entities.Driver;

import java.util.List;

public interface DriverMatcheStratiges {
    List<Driver> findMatchesDriver(RideRequestDTO rideRequestDTO);
}

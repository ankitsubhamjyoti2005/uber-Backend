package com.uber.app.strategies;

import com.uber.app.dto.RideRequestDTO;

public interface RideFareCalculation {
    double calculateFare(RideRequestDTO rideRequestDTO);
}

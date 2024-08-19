package com.uber.app.strategies;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.entities.RideRequest;

public interface RideFareCalculation {
    static final double RIDER_FAIR_MULTIPLIER = 10;
    double calculateFare(RideRequest rideRequest);
}

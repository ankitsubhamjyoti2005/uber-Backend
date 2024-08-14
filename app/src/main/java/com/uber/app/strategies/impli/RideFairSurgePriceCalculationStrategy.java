package com.uber.app.strategies.impli;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.strategies.RideFareCalculation;

public class RideFairSurgePriceCalculationStrategy implements RideFareCalculation {

    @Override
    public double calculateFare(RideRequestDTO rideRequestDTO) {
        return 0;
    }
}

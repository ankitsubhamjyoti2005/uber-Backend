package com.uber.app.strategies.impli;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.entities.RideRequest;
import com.uber.app.services.DistanceServices;
import com.uber.app.services.impli.DistanceServiceOSRMImpli;
import com.uber.app.strategies.RideFareCalculation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class RideFairDefaultStraigies implements RideFareCalculation {

    private final DistanceServices distanceServices;

    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceServices.calculateDistance(rideRequest.getPickUpLocation(),
                rideRequest.getDropOffLocation());

        return distance*RIDER_FAIR_MULTIPLIER;
    }
}

package com.uber.app.strategies;

import com.uber.app.strategies.impli.DriveMatchingNearestDriverStratigies;
import com.uber.app.strategies.impli.DriverMatchesHighestRatedDriver;
import com.uber.app.strategies.impli.RideFairDefaultStraigies;
import com.uber.app.strategies.impli.RideFairSurgePriceCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class stratigyManager {
    private final DriverMatchesHighestRatedDriver highestRatedDriverStrategy;
    private final DriveMatchingNearestDriverStratigies nearestDriverStrategy;
    private final RideFairSurgePriceCalculationStrategy surgePricingFareCalculationStrategy;
    private final RideFairDefaultStraigies defaultFareCalculationStrategy;

    public DriverMatcheStratiges driverMatchingStrategy(double riderRating) {
        if(riderRating >= 4.8) {
            return highestRatedDriverStrategy;
        } else {
            return nearestDriverStrategy;
        }
    }

    public RideFareCalculation rideFareCalculationStrategy() {

//        6PM to 9PM is SURGE TIME
        LocalTime surgeStartTime = LocalTime.of(18, 0);
        LocalTime surgeEndTime = LocalTime.of(21, 0);
        LocalTime currentTime = LocalTime.now();

        boolean isSurgeTime = currentTime.isAfter(surgeStartTime) && currentTime.isBefore(surgeEndTime);

        if(isSurgeTime) {
            return surgePricingFareCalculationStrategy;
        } else {
            return defaultFareCalculationStrategy;
        }
    }

}

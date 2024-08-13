package com.uber.app.services.impli;

import com.uber.app.dto.RideDTO;
import com.uber.app.dto.RiderDTO;
import com.uber.app.dto.driverDTO;
import com.uber.app.services.DriverServices;

import java.util.List;

public class DriverServicesImpli implements DriverServices {
    @Override
    public RiderDTO cancleRide(Long rideID) {
        return null;
    }

    @Override
    public RiderDTO sartRider(Long riderId) {
        return null;
    }

    @Override
    public RiderDTO endRider(Long riderId) {
        return null;
    }

    @Override
    public RiderDTO rateRider(Long riderId) {
        return null;
    }

    @Override
    public driverDTO getProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRide() {
        return List.of();
    }
}

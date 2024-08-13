package com.uber.app.services.impli;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.dto.RiderDTO;
import com.uber.app.dto.driverDTO;
import com.uber.app.services.RideService;
import com.uber.app.services.RiderService;

import java.util.List;


public class RiderServiceImpli implements RiderService {

    @Override
    public RideRequestDTO requestRide(RideService rideRequestDTO) {
        return null;
    }

    @Override
    public driverDTO ratedriver(Long riderId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getProfile() {
        return null;
    }

    @Override
    public List<RiderDTO> getAllMyRide() {
        return List.of();
    }
}

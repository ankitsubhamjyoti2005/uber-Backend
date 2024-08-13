package com.uber.app.services;

import com.uber.app.dto.RideDTO;
import com.uber.app.dto.RiderDTO;
import com.uber.app.dto.driverDTO;
import com.uber.app.entities.Rider;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface DriverServices {
    RiderDTO cancleRide(Long rideID);

    RiderDTO sartRider(Long riderId);

    RiderDTO endRider(Long riderId);

    RiderDTO rateRider(Long riderId);

    driverDTO getProfile();

    List<RideDTO> getAllMyRide();
}

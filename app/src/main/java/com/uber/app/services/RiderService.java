package com.uber.app.services;

import com.uber.app.dto.RideDTO;
import com.uber.app.dto.RideRequestDTO;
import com.uber.app.dto.RiderDTO;
import com.uber.app.dto.driverDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RiderService {

    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);


    driverDTO ratedriver(Long riderId , Integer rating);

    RiderDTO getProfile();

    List<RiderDTO> getAllMyRide();

}

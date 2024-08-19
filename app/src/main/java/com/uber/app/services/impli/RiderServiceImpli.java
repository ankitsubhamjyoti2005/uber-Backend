package com.uber.app.services.impli;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.dto.RiderDTO;
import com.uber.app.dto.driverDTO;
import com.uber.app.entities.RideRequest;
import com.uber.app.entities.enums.RideRequestStatus;
import com.uber.app.repositories.RideRequestRepository;
import com.uber.app.services.RiderService;
import com.uber.app.strategies.DriverMatcheStratiges;
import com.uber.app.strategies.RideFareCalculation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpli implements RiderService {
    private final ModelMapper modelMapper;
    private final RideFareCalculation rideFareCalculation;
    private final DriverMatcheStratiges driverMatcheStratiges;
    private final RideRequestRepository rideRequestRepository;

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        RideRequest rideRequest = modelMapper.map(rideRequestDTO,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fair = rideFareCalculation.calculateFare(rideRequest);
        rideRequest.setFair(fair);

        RideRequest saveRideRequest = rideRequestRepository.save(rideRequest);
        driverMatcheStratiges.findMatchesDriver(rideRequest);


        log.info(rideRequest.toString());
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

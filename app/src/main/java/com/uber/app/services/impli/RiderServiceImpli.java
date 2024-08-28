package com.uber.app.services.impli;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.dto.RiderDTO;
import com.uber.app.dto.driverDTO;
import com.uber.app.entities.RideRequest;
import com.uber.app.entities.Rider;
import com.uber.app.entities.Users;
import com.uber.app.entities.enums.RideRequestStatus;
import com.uber.app.exception.ResourceNotFoundException;
import com.uber.app.repositories.RideRequestRepository;
import com.uber.app.repositories.RiderRepository;
import com.uber.app.services.RiderService;
import com.uber.app.strategies.DriverMatcheStratiges;
import com.uber.app.strategies.RideFareCalculation;
import com.uber.app.strategies.stratigyManager;
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
//    private final RideFareCalculation rideFareCalculation;
    private final stratigyManager rideStrategyManager;
//    private final DriverMatcheStratiges driverMatcheStratiges;
    private final RideRequestRepository rideRequestRepository;
    private final RiderRepository riderRepository;

    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        Rider rider = getCurrentRider();
        RideRequest rideRequest = modelMapper.map(rideRequestDTO,RideRequest.class);
        rideRequest.setRideRequestStatus(RideRequestStatus.PENDING);

        Double fair = rideStrategyManager.rideFareCalculationStrategy().calculateFare(rideRequest);
        rideRequest.setFair(fair);

        RideRequest saveRideRequest = rideRequestRepository.save(rideRequest);
        rideStrategyManager.driverMatchingStrategy(rider.getRating()).findMatchesDriver(rideRequest);

        return null;
    }

    @Override
    public RiderDTO cancleRide(Long rideId) {
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

    @Override
    public Rider createNewRider(Users user) {
        Rider rider = Rider
                .builder()
                .user(user)
                .rating(0.0)
                .build();
        return riderRepository.save(rider);
    }

    @Override
    public Rider getCurrentRider() {
        //TODO : impliment whean learn about spring security
        return riderRepository.findById(1L).orElseThrow(()->new ResourceNotFoundException(
                "RIDER IS NOT FOUND WITH ID :"+1
        ));
    }
}

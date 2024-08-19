package com.uber.app.controllers;

import com.uber.app.dto.RideRequestDTO;
import com.uber.app.services.RideService;
import com.uber.app.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
public class RiderController {

    @GetMapping("/a")
    public String ma(){
        return "hello";
    }

    private final RiderService riderService;
    @PostMapping("/requestRide")
    public ResponseEntity<RideRequestDTO> requestRide(@RequestBody RideRequestDTO rideRequestDTO){
        return ResponseEntity.ok( riderService.requestRide(rideRequestDTO));
    }
}

package com.uber.app.dto;

import com.uber.app.entities.Driver;
import com.uber.app.entities.Rider;
import com.uber.app.entities.enums.PaymentMethod;
import com.uber.app.entities.enums.RideStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDTO {
    private long id;


    private Point pickupLocation;


    private Point dropOffLocation;


    private LocalDateTime createdTime;


    private RiderDTO rider;


    private Driver driver;
    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}

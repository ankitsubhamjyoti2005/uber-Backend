package com.uber.app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.geolatte.geom.Point;

@Entity
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private Double rating;

    private Boolean avalable;

    @Column(columnDefinition = "Geometry(point,4326)")
    Point currentLocation;
}

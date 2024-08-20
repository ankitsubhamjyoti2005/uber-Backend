package com.uber.app.services;

import org.geolatte.geom.Point;
import org.springframework.stereotype.Service;



public interface DistanceServices {
    double calculateDistance(Point src, Point dest);
}

package com.uber.app.services;

import org.locationtech.jts.geom.Point;



public interface DistanceServices {
    double calculateDistance(Point src, Point dest);

}

package com.uber.app.services.impli;

import com.uber.app.services.DistanceServices;
import org.geolatte.geom.Point;

public class DistanceServiceOSRMImpli implements DistanceServices {
    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}

package com.uber.app.services.impli;

import com.uber.app.services.DistanceServices;
import org.geolatte.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceOSRMImpli implements DistanceServices {
    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}

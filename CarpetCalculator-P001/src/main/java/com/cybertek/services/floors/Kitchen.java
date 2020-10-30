package com.cybertek.services.floors;

import com.cybertek.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {
    //circle
    @Value("${floorType.kitchen.circle.radius}")
    private double radius;

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}

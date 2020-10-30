package com.cybertek.services.floors;

import com.cybertek.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom implements Floor {
    //rectangle
    @Value("${floorType.livingRoom.rectangle.hLength}")
    private double hLength; // h x v rectangle
    @Value("${floorType.livingRoom.rectangle.vlength}")
    private double vLength;
    @Override
    public double getArea() {
        return hLength*vLength;
    }
}

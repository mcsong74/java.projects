package com.cybertek.services.floors;

import com.cybertek.interfaces.floorType.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements Floor {
    //square
    @Value("${floorType.bedroom.square.length}")
    private double nLength; // nxn square


    @Override
    public double getArea() {
        return Math.pow(nLength, 2);
    }
}

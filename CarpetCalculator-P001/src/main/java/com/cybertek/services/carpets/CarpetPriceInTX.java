package com.cybertek.services.carpets;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrice.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetPriceInTX implements Carpet {
    @Value("#{${price.tx}}")
    public Map<String, String> carpetUnitPrices;

    @Override
    public String toString() {
        return "CarpetPriceInTX{" +
                "carpetUnitPrices=" + carpetUnitPrices +
                '}';
    }



    @Override
    public double getCarpetPrice(String city) {

        if(!carpetUnitPrices.containsKey(city)) {
            System.out.println("\n\t >>> ERROR >>> City value ["+city+"] passed in the parameter do not exists in <Enum> City. \n");
            throw new EnumConstantNotPresentException(City.class, city);
        }

        return Double.valueOf(carpetUnitPrices.get(city))  ;

    }



}

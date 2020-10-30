package com.cybertek.services.carpets;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrice.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetPriceInVA implements Carpet {
    //    @Value("#{PropertySplitter.map('${unitprice.va}')}")
    @Value("#{${price.va}}")
    public Map<String, String> carpetUnitPrices;


    @Override
    public double getCarpetPrice(String city) {
        if(!carpetUnitPrices.containsKey(city)) {
            System.out.println("\n\t >>> ERROR >>> City value ["+city+"] passed in the parameter do not exists in <Enum> City. \n");
            throw new EnumConstantNotPresentException(City.class, city);
        }
        return Double.valueOf(carpetUnitPrices.get(city));

    }


}

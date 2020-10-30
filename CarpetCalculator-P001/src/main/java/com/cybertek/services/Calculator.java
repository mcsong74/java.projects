package com.cybertek.services;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrice.Carpet;
import com.cybertek.interfaces.floorType.Floor;
import com.cybertek.services.carpets.CarpetPriceInTX;
import com.cybertek.services.carpets.CarpetPriceInVA;
import com.cybertek.services.floors.Bedroom;
import com.cybertek.services.floors.Kitchen;
import com.cybertek.services.floors.LivingRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.text.DecimalFormat;
import java.util.NoSuchElementException;

@Component
public class Calculator  {
//    private String state;
    private Carpet txPrice;
    private Carpet vaPrice;
    private Floor bedRoom;
    private Floor kitchen;
    private Floor livingRoom;

    @Value("${input.state}")
    private String state;
    @Value("${input.city}")
    private String city;
    @Value("${floorType}")
    private String floorType;

    public Calculator(@Qualifier("carpetPriceInTX") Carpet txPrice, @Qualifier("carpetPriceInVA") Carpet vaPrice, @Qualifier("bedroom") Floor bedRoom, Floor kitchen, Floor livingRoom) {
        this.txPrice = txPrice;
        this.vaPrice = vaPrice;
        this.bedRoom = bedRoom;
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
    }

    public void calculator(){
        double unitPrice=0, area=0;
        DecimalFormat dollarFormat=new DecimalFormat("#,###.00");
        switch (state){
            case "VA": case "va": case "Virginia":
                unitPrice=vaPrice.getCarpetPrice(city);
                break;
            case "TX": case "tx": case "Texas":
                unitPrice=txPrice.getCarpetPrice(city );
                break;
            default:
                unitPrice=0.0;
        }
        switch (floorType.toLowerCase()){
            case "bedroom":
                area=bedRoom.getArea();
                break;
            case "kitchen":
                area=kitchen.getArea();
                break;
            case "livingroom":
                area=livingRoom.getArea();
                break;
            default:
        }

        System.out.println(" -------------------------------------------------------- ");
        System.out.println(" State = "+state);
        System.out.println(" City = "+city);
        System.out.println(" Floor type = "+floorType);
        System.out.println(" -------------------------------------------------------- ");
        System.out.println(" Carpet Unit price  = $"+(dollarFormat.format(unitPrice)) +"/sq.ft.");
        System.out.println(" Floor type ["+floorType+"], area = "+String.format("%.5f", area)+" sq.ft.");
        System.out.println(" Total Cost of the carpet = $"+dollarFormat.format(unitPrice*area));
        System.out.println(" -------------------------------------------------------- ");


    }

}

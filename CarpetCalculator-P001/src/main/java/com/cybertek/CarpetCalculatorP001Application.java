package com.cybertek;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrice.Carpet;
import com.cybertek.interfaces.floorType.Floor;
import com.cybertek.services.Calculator;
import com.cybertek.services.carpets.CarpetPriceInTX;
import com.cybertek.services.carpets.CarpetPriceInVA;
import com.sun.tools.javac.code.Attribute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetCalculatorP001Application {

	public static void main(String[] args) {
//		SpringApplication.run(CarpetCalculatorP001Application.class, args);
		ApplicationContext container = SpringApplication.run(CarpetCalculatorP001Application.class, args);

		Calculator carpetCal=container.getBean("calculator", Calculator.class);
		carpetCal.calculator();

		System.out.println(City.values());;

//		System.out.println(unitPrice.getCarpetPrice(City.DALLAS));
//		System.out.println(City.DALLAS);r
//		String State="TX";
//		String City="Dallas";
//		String roomType="Circle";
//		double carpet1=2.50;
//		double stateSalesTaxRate=0.0;
//		double citySalesTax=0.0;
//		double area=0.0;
//		double radius, x=0.0, y=0.0;®
//		radius=12.0;

//		switch (roomType){
//			case "Circle":
//				area=Math.PI* (radius*radius);//area=3.14159(Math.pow(radius, 2.0));
//				break;
//			case "Square": case "Rectangular":
//				area=x*y;
//				break;
//			default:
//
//		}
////		System.out.println(area);
////		System.out.println(String.format("%.2f", area));
//
//		switch (State){
//			case "TX":
//				stateSalesTaxRate=0.0625;
//				break;
//			case "VA":
//				stateSalesTaxRate=0.043;
//				break;
//			default:
//				stateSalesTaxRate=0.01;
//		}
//		switch (City){
//			case "Dallas":
//				citySalesTax=0.0825;
//				break;
//			case "Austin":
//				citySalesTax=0.0825;
//				break;
//			case "San Antonio":
//				citySalesTax=0.0825;
//				break;
//			case "Arlington":
//				citySalesTax=0.06;
//				break;
//			case "Fairfax":
//				citySalesTax=0.06;
//				break;
//			case "McClean":
//				citySalesTax=0.06;
//				break;
//			default:
//		}
//		double carpetCost;
//		carpetCost=(area*carpet1)+((area*carpet1)*(stateSalesTaxRate+citySalesTax));
//		System.out.println((area*carpet1));
//		System.out.println(((area*carpet1)*(stateSalesTaxRate+citySalesTax)));
////		System.out.println("Carpet Price = $"+String.format("%.2f", carpetCost));
//
//		DecimalFormat dollarFormat=new DecimalFormat("#.00");
//		System.out.println("Carpet Price (formatted) = $"+dollarFormat.format(carpetCost));
//	}
//

	}
}
//	ApplicationContext container=SpringApplication.run(Spring07SpringBootDemoApplication.class, args);
//	Course course=container.getBean("java", Course.class);
//		System.out.println(course.getTeachingHours());

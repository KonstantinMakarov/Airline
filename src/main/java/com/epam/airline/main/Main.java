package com.epam.airline.main;

import com.epam.airline.entity.AirlineCompany;
import com.epam.airline.entity.Plane;
import com.epam.airline.entity.PlaneEnum;
import com.epam.airline.logic.PlaneOperation;
import com.epam.airline.logic.Verifier;
import com.epam.airline.logic.creator.PlaneFactory;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Main {

    public static void main(String[] args) {
        AirlineCompany company = AirlineCompany.getInstance();
        Plane plane;
        for(PlaneEnum planeEnum : PlaneEnum.values()){
            plane = PlaneFactory.buildPlane(planeEnum);
            if(Verifier.checkPlane(plane)){
                company.addPlane(plane);
            }
        }

        System.out.println("\nPlanes of company:");
        for(Plane currentPlane : company.getPlanes()){
            System.out.println(currentPlane);
        }

        System.out.println("\nTotal capacity = " + PlaneOperation.totalCapacity(company.getPlanes()));
        System.out.println("\nTotal seats = " + PlaneOperation.totalSeats(company.getPlanes()));
        System.out.println("\nSort by range:\n" + PlaneOperation.sortByRange(company.getPlanes()));
        System.out.println("\nFind planes by fuel:\n" +
                                        PlaneOperation.findPlanesByFuel(company.getPlanes(), 15, 20));

    }
}

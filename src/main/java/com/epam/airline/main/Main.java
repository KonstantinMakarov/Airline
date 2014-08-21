package com.epam.airline.main;

import com.epam.airline.entity.AirlineCompany;
import com.epam.airline.entity.Plane;
import com.epam.airline.entity.PlaneEnum;
import com.epam.airline.entity.creator.PlaneFactory;
import com.epam.airline.logic.PlaneOperation;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Main {

    public static void main(String[] args) {
        //todo verification here or in factory or in all methods
        AirlineCompany company = AirlineCompany.getInstance();
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.AN_124));
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.AN_225));
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.BOEING_747_400));
        //company.addPlane(null);
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.BOEING_737));
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.AIRBUS_А380));

        System.out.println("\nPlanes of company:");
        for(Plane plane : company.getPlanes()){
            System.out.println(plane);
        }


        System.out.println("\nTotal capacity = " + PlaneOperation.totalCapacity(company.getPlanes()));
        System.out.println("\nTotal seats = " + PlaneOperation.totalSeats(company.getPlanes()));
        System.out.println("\nSort by range:\n" + PlaneOperation.sortByRange(company.getPlanes()));
        System.out.println("\nFind planes by fuel:\n" +
                                        PlaneOperation.findPlanesByFuel(company.getPlanes(), 15, 20));

    }
}

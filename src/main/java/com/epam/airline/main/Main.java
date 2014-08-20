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
        //todo verification here or in factory
        AirlineCompany company = AirlineCompany.getInstance();
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.AN_124));
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.AN_225));
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.BOEING_747_400));
        company.addPlane(null);
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.BOEING_737));
        company.addPlane(PlaneFactory.buildPlane(PlaneEnum.AIRBUS_А380));

        for(Plane plane : company.getPlanes()){
            System.out.println(plane);
        }

        System.out.println(PlaneOperation.totalCapacity(company.getPlanes()));
        System.out.println(PlaneOperation.totalSeating(company.getPlanes()));
        System.out.println(PlaneOperation.findPlanesByFuel(company.getPlanes(), 15, 20));

    }
}

package com.epam.airline.main;

import com.epam.airline.entity.AirlineCompany;
import com.epam.airline.entity.Airliner;
import com.epam.airline.entity.Freighter;
import com.epam.airline.entity.Plane;

import java.util.ArrayList;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Main {
    AirlineCompany airlineCompany = AirlineCompany.getInstance();
    public static void main(String[] args){
        ArrayList<Plane> integerArrayList = new ArrayList<Plane>();
        Plane a = new Freighter("bu", -5, 7, 6);

        integerArrayList.add(a);
        integerArrayList.add(new Airliner("", 50, 0, 5));
        for(Plane elem : integerArrayList){
            System.out.println(elem);
        }
    }
}

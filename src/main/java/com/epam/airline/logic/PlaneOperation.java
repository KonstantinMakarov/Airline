package com.epam.airline.logic;

import com.epam.airline.entity.Airliner;
import com.epam.airline.entity.Freighter;
import com.epam.airline.entity.Plane;

import java.util.*;

/**
 * Use for ...
 */
public  class PlaneOperation {

    public static List<Plane> findPlanesByFuel(List<Plane> planes, int lowValue, int highValue) {

        List<Plane> rightPlanes = new ArrayList<Plane>();
        for (Plane plane : planes) {
            if ((plane.getFuelConsumption() >= lowValue) && (plane.getFuelConsumption() <= highValue)) {
                rightPlanes.add(plane);
            }
        }
        return rightPlanes;
    }


    public static Set<Plane> sortByRange(List<Plane> planes) {

        Set<Plane> planeSet = new TreeSet<Plane>(new PlaneRangeComparator());

        for (Plane plane : planes) {
            planeSet.add(plane);
        }
        return planeSet;
    }

    public static int totalSeating(List<Plane> planes) {
        int seats = 0;

        for (Plane plane : planes) {
            if(plane instanceof Airliner){
                Airliner airliner = (Airliner)plane;
                seats += airliner.getSeats();
            }
        }
        return seats;
    }

    public static int totalCapacity(List<Plane> planes) {
        int capacity = 0;

        for (Plane plane : planes) {
            if(plane instanceof Freighter){
                Freighter freighter = (Freighter)plane;
                capacity += freighter.getCapacity();
            }
        }
        return capacity;
    }
}

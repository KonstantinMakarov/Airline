package com.epam.airline.logic;

import com.epam.airline.entity.Airliner;
import com.epam.airline.entity.Freighter;
import com.epam.airline.entity.Plane;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    public static void sortByRange(LinkedList<Plane> planes) {
        PlaneSorter comparator = new PlaneSorter();
        comparator.sortByRange(planes);
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

package com.epam.airline.logic;

import com.epam.airline.entity.Plane;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class PlaneSorter {

    public static void sortByRange(LinkedList<Plane> planes) {

        Comparator<Plane> planeComparator = new PlaneRangeComparator();
        Set<Plane> planeSet = new TreeSet<Plane>(planeComparator);

        for (Plane plane : planes) {
            planeSet.add(plane);
        }
    }
}

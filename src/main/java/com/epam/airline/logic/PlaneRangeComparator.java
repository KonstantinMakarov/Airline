package com.epam.airline.logic;

import com.epam.airline.entity.Plane;

import java.util.Comparator;

/**
 * Comparator for planes. Compare by range.
 */
public class PlaneRangeComparator implements Comparator<Plane> {

    @Override
    public int compare(Plane p1, Plane p2) {
        if(p1.getRange() < p2.getRange()){
            return -1;
        }
        else if(p1.getRange() == p2.getRange()){
            return 0;
        }
        else {
            return 1;
        }
    }
}

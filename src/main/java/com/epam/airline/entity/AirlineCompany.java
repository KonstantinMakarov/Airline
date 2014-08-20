package com.epam.airline.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class AirlineCompany {
    private List<Plane> planes = new ArrayList<Plane>();
    private static AirlineCompany instance = null;

    private AirlineCompany(){

    }

    public static synchronized AirlineCompany getInstance() {
        if(null == instance){
            return new AirlineCompany();
        }
        return instance;
    }

    public List<Plane> getPlanes() {
        return Collections.unmodifiableList(planes);
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }
}

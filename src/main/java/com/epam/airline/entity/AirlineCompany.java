package com.epam.airline.entity;

import java.util.List;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class AirlineCompany {
    List<Plane> planes;
    static AirlineCompany instance;

    private AirlineCompany(){

    }

    public static synchronized AirlineCompany getInstance() {
        if(null == instance){
            return new AirlineCompany();
        }
        return instance;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }
}

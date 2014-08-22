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

    @Override
    public String toString() {
        return "AirlineCompany{" +
                "planes=" + planes +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AirlineCompany)) return false;

        AirlineCompany company = (AirlineCompany) obj;

        if (!planes.equals(company.planes)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 7 * result + planes.hashCode();
        return result;
    }
}

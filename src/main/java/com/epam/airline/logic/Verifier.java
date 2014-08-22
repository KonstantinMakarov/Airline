package com.epam.airline.logic;

import com.epam.airline.entity.Airliner;
import com.epam.airline.entity.Freighter;
import com.epam.airline.entity.Plane;

/**
 * Created by Kanstantsin_Makarau on 8/21/2014.
 */
public class Verifier {

    public static boolean checkPlane(Plane plane){
        if(plane.getName() == "" || plane.getRange() <= 0 || plane.getFuelConsumption() <= 0){
            return false;
        }

        if(plane instanceof Airliner){
            Airliner airliner = (Airliner)plane;
            if(airliner.getSeats() <= 0){
                return false;
            }
        }
        if(plane instanceof Freighter){
            Freighter freighter = (Freighter)plane;
            if(freighter.getCapacity() <= 0){
                return false;
            }
        }

        return true;
    }
}

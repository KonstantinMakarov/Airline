package com.epam.airline.logic;

import com.epam.airline.entity.Airliner;
import com.epam.airline.entity.Plane;

/**
 * Created by Kanstantsin_Makarau on 8/21/2014.
 */
public class Verifier {
    //todo
    public static boolean checkPlane(Plane plane){
        Airliner airliner = null;
        if(plane instanceof Airliner){
            airliner = (Airliner)plane;
            if(airliner.getName() == ""){
                return false;
            }
        }
        return true;
    }
}

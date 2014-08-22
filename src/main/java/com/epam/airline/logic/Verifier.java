package com.epam.airline.logic;

import com.epam.airline.entity.PlaneEnum;

/**
 * Check plane parameters from PlaneEnum.
 */
public class Verifier {

    public static boolean checkPlaneParameters(PlaneEnum planeEnum) throws IllegalArgumentException{
        if (planeEnum.getName() == "") {
            throw new IllegalArgumentException("Illegal name in " + planeEnum);
        }
        if(planeEnum.getOthers().get(0) <= 0){
            throw new IllegalArgumentException("Illegal range in " + planeEnum);
        }
        if(planeEnum.getOthers().get(1) <= 0){
            throw new IllegalArgumentException("Illegal fuel consumption in " + planeEnum);
        }
        if (planeEnum.getType().equalsIgnoreCase("Airliner")) {
            if(planeEnum.getOthers().get(2) <= 0){
                throw new IllegalArgumentException("Illegal seats in " + planeEnum);
            }
        }
        if (planeEnum.getType().equalsIgnoreCase("Freighter")) {
            if(planeEnum.getOthers().get(2) <= 0){
                throw new IllegalArgumentException("Illegal capacity in " + planeEnum);
            }
        }
        return true;
    }
}

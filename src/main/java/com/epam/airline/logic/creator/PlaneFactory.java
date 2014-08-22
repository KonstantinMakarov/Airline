package com.epam.airline.logic.creator;

import com.epam.airline.entity.Airliner;
import com.epam.airline.entity.Freighter;
import com.epam.airline.entity.Plane;
import com.epam.airline.entity.PlaneEnum;
import com.epam.airline.logic.Verifier;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class PlaneFactory {

    public static Plane buildPlane(PlaneEnum planeEnum) {
        Plane plane = null;
        try {
            if (planeEnum.getType().equals("airliner")) {
                if (Verifier.checkPlaneParameters(planeEnum)) {
                    plane = new Airliner(planeEnum.getName(), planeEnum.getOthers().get(0),
                            planeEnum.getOthers().get(1), planeEnum.getOthers().get(2));
                }
            } else if (planeEnum.getType().equals("freighter")) {
                if (Verifier.checkPlaneParameters(planeEnum)) {
                    plane = new Freighter(planeEnum.getName(), planeEnum.getOthers().get(0),
                            planeEnum.getOthers().get(1), planeEnum.getOthers().get(2));
                }
            }
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return plane;
    }
}

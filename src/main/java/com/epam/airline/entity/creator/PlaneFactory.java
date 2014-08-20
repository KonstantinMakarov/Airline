package com.epam.airline.entity.creator;

import com.epam.airline.entity.Airliner;
import com.epam.airline.entity.Freighter;
import com.epam.airline.entity.Plane;
import com.epam.airline.entity.PlaneEnum;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class PlaneFactory {

    public static Plane buildPlane(PlaneEnum planeEnum) {
        Plane plane = null;
        if(planeEnum.getType().equals("airliner")){
            plane = new Airliner(planeEnum.getName(), planeEnum.getOthers().get(0),
                    planeEnum.getOthers().get(1), planeEnum.getOthers().get(2));
        }
        else if(planeEnum.getType().equals("freighter")){
            plane = new Freighter(planeEnum.getName(), planeEnum.getOthers().get(0),
                    planeEnum.getOthers().get(1), planeEnum.getOthers().get(2));
        }
        else throw new IllegalArgumentException("Illegal plane type");

        return plane;
    }
}

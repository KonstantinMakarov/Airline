package com.epam.airline.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Use for ...
 */
public enum PlaneEnum {
    AN_225("freighter", "AN_225", 3500, 15, -5),
    AN_124("freighter", "AN_124", 2000, 13, 60),
    BOEING_747_400("freighter", "BOEING_747_400", 5000, 17, 110),

    AIRBUS_А380("airliner", "AIRBUS_А380", 10000, 10, 480),
    BOEING_737("airliner", "BOEING_737", 13000, 8, 500);

    private String type;
    private String name;

    List<Integer> others = new ArrayList<Integer>();
    PlaneEnum(String type, String name, Integer... args) {
        this.type = type;
        this.name = name;
        this.others.addAll(Arrays.asList(args));
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getOthers() {
        return Collections.unmodifiableList(others);
    }

    @Override
    public String toString() {
        StringBuilder planeEnumBuilder = new StringBuilder();
        planeEnumBuilder.append("PlaneEnum{\n").append("type=").append(type);
        planeEnumBuilder.append(", Name=").append(name);
        planeEnumBuilder.append(", Range=").append(others.get(0));
        planeEnumBuilder.append(", Fuel Consumption=").append(others.get(1));
        if(type.equalsIgnoreCase("Airliner")){
            planeEnumBuilder.append(", Seats=").append(others.get(2)).append("\n}");
        }
        if(type.equalsIgnoreCase("Freighter")){
            planeEnumBuilder.append(", Capacity=").append(others.get(2)).append(";\n}");
        }
        return planeEnumBuilder.toString();
    }
}

package com.epam.airline.entity;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Plane {
    private String name;
    private int range;
    private int fuelConsumption;

    public Plane(String name, int range, int fuelConsumption){
        this.name = name;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("Name ").append(this.name);
        builder.append(" Fuel Consumption ").append(this.fuelConsumption);
        builder.append(" Range ").append(this.range);

        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Plane plane = (Plane) obj;
        return (this.name == plane.getName() &&
                this.range == plane.getRange() &&
                this.fuelConsumption == plane.getFuelConsumption());
    }


    @Override
    public int hashCode() {
        int code = 11;
        int k = 7;
        code = k * (code + this.name.hashCode());
        code = k * (code + this.range);
        code = k * (code + this.fuelConsumption);
        return code;
    }

    public String getName() {
        return name;
    }

    public int getRange() {
        return range;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
}

package com.epam.airline.entity;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Plane {
    private String name;
    private int range;
    private int fuelConsumption;

    public Plane(String name, int range, int fuelConsumption) throws IllegalArgumentException{
        this.name = name;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("---Name: ").append(name);
        builder.append("; Range: ").append(range);
        builder.append("; Fuel Consumption: ").append(fuelConsumption);

        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (null == obj || getClass() != obj.getClass()){
            return false;
        }
        Plane plane = (Plane) obj;
        return (this.name == plane.getName() &&
                this.range == plane.getRange() &&
                this.fuelConsumption == plane.getFuelConsumption());
    }


    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 7 * result + name.hashCode();
        result = 7 * result + range;
        result = 7 * result + fuelConsumption;
        return result;
    }

}

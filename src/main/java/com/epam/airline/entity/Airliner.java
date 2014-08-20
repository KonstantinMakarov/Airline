package com.epam.airline.entity;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Airliner extends Plane {
    private int seats;

    public Airliner(String name, int range, int fuelConsumption, int seats) {
        super(name, range, fuelConsumption);
        this.seats = seats;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append("; Seats: ").append(this.seats);
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
        if (!super.equals(obj)){
            return false;
        }
        Airliner airliner = (Airliner) obj;
        return seats == airliner.seats;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 7 * result + seats;
        return result;
    }

    public int getSeats() {
        return seats;
    }
}

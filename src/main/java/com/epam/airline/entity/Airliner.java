package com.epam.airline.entity;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Airliner extends Plane {
    private int seats;

    public Airliner(String name, int range, int fuelConsumption, int seats) {
        super(name, range, fuelConsumption);
        try{
            if(seats <= 0){
                throw new IllegalArgumentException("Illegal seats");
            }
            this.seats = seats;
        }
        catch (IllegalArgumentException e){
            System.out.println(new StringBuilder().append(this.getClass()).append(" ").append(e.getMessage()));
        }
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

    public int getCapacity() {
        return seats;
    }
}

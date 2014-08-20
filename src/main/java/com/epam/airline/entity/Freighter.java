package com.epam.airline.entity;

/**
 * Created by Kanstantsin_Makarau on 8/19/2014.
 */
public class Freighter extends Plane {
    private int capacity;

    public Freighter(String name, int range, int fuelConsumption, int capacity) {
        super(name, range, fuelConsumption);
        try{
            if(capacity <= 0){
                throw new IllegalArgumentException("Illegal capacity");
            }
            this.capacity = capacity;
        }
        catch (IllegalArgumentException e){
            System.out.println(new StringBuilder().append(this.getClass()).append(" ").append(e.getMessage()));
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()).append("; Capacity: ").append(this.capacity);
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
        Freighter freighter = (Freighter) obj;
        return capacity == freighter.capacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 7 * result + capacity;
        return result;
    }

    public int getCapacity() {
        return capacity;
    }
}

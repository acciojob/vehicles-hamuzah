package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;


     //constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    //implementing methods for the interface
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}

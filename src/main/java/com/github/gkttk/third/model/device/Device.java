package com.github.gkttk.third.model.device;


public class Device {

    private final String name;
    private final double powerConsumption;


    public Device(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
    }


    public String getName() {
        return name;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }


}

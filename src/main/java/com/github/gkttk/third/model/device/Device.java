package com.github.gkttk.third.model.device;

public abstract class Device {

    protected String name;
    protected double powerConsumption;
    protected boolean connected;

    public Device() {
        this.connected = false;
    }

    public String getName() {
        return name;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isConnected() {
        return connected;
    }

    public void plugIn(){
        this.connected = true;
    }

    public void unplug(){
        this.connected = false;
    }
}

package com.github.gkttk.third.model.result;

import com.github.gkttk.third.model.device.Device;

import java.util.List;

/**
 * This class stores information about the socket working
 */

public class Result {

    private List<Device> devices;
    private int numberConnectedDevices;
    private double currentPowerConsumption;

    public Result(List<Device> devices, int numberConnectedDevices, double currentPowerConsumption) {
        this.devices = devices;
        this.numberConnectedDevices = numberConnectedDevices;
        this.currentPowerConsumption = currentPowerConsumption;
    }


    public List<Device> getDevices() {
        return devices;
    }

    public int getNumberConnectedDevices() {
        return numberConnectedDevices;
    }

    public double getCurrentPowerConsumption() {
        return currentPowerConsumption;
    }
}

package com.github.gkttk.third.logic.handler;

import com.github.gkttk.third.model.Electricity;
import com.github.gkttk.third.model.device.Device;

import java.util.List;


/**
 * This class is responsible for calculating and storing the devices power consumption.
 */

public class CurrentPowerDevicesHandler {

    private double currentPowerConsumption;

    public CurrentPowerDevicesHandler() {
        this.currentPowerConsumption = 0;
    }

    /**
     * Method for calculate current power consumption of all devices of electricity object.
     *
     * @param electricity object with plugged in devices
     */
    public void calculatePowerConsumption(Electricity electricity) {
        List<Device> devices = electricity.getDevices();
        currentPowerConsumption = 0;
        for (Device device : devices) {
            double devicePower = device.getPowerConsumption();
            currentPowerConsumption += devicePower;
        }
    }

    public double getCurrentPowerConsumption() {
        return currentPowerConsumption;
    }
}

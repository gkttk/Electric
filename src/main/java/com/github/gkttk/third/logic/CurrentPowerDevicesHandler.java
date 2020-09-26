package com.github.gkttk.third.logic;

import com.github.gkttk.third.model.device.Device;

import java.util.List;


/**
 * This class is responsible for calculating the devices power consumption
 */

public class CurrentPowerDevicesHandler implements DevicesHandler {

    /**
     * @param devices list of devices
     * @return total power consumption of plugged in devices
     */
    @Override
    public double processDevices(List<Device> devices) {
        double powerSum = 0.0;

        for (Device device : devices) {
            if (device.isConnected()) {
                double devicePower = device.getPowerConsumption();
                powerSum += devicePower;
            }
        }

        return powerSum;
    }
}

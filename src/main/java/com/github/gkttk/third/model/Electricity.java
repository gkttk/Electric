package com.github.gkttk.third.model;

import com.github.gkttk.third.logic.handler.CurrentPowerDevicesHandler;
import com.github.gkttk.third.model.device.Device;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents an entity of electric socket.
 */

public class Electricity {

    /**
     * List of plugged in devices.
     */
    private final List<Device> devices;


    /**
     * An object responding for calculate currentTotalPowerConsumption.
     */
    private final CurrentPowerDevicesHandler currentPowerDevicesHandler;


    public Electricity() {
        this.devices = new ArrayList<>();
        this.currentPowerDevicesHandler = new CurrentPowerDevicesHandler();
    }


    /**
     * The method for plugging in one device if it has not already plugged in.
     *
     * @param device Device for plugging in.
     */
    public void plugInDevice(Device device) {
        if (!devices.contains(device)) {
            devices.add(device);
        }
        calculateCurrentPowerConsumption();
    }

    /**
     * The method for plugging out one device if it is plugged in.
     *
     * @param device Device for plugging out.
     */
    public void plugOutDevice(Device device) {
        this.devices.remove(device);
        calculateCurrentPowerConsumption();
    }

    /**
     * The method for plugging in several devices if they are not plugged in.
     *
     * @param devices List of devices for plugging in.
     */
    public void plugInDevices(List<Device> devices) {
        for (Device device : devices) {
            plugInDevice(device);
        }
    }

    /**
     * Private method for calculating currentPowerConsumption field.
     * This method is calling when extra device is plugging in or plugging out.
     */
    private void calculateCurrentPowerConsumption() {
        currentPowerDevicesHandler.calculatePowerConsumption(this);
    }

    public List<Device> getDevices() {
        return devices;
    }

    public double getCurrentTotalPowerConsumption() {
        return currentPowerDevicesHandler.getCurrentPowerConsumption();
    }


}

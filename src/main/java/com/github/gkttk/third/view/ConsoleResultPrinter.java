package com.github.gkttk.third.view;

import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.result.Result;

import java.util.List;

/**
 * This class is responsible for console output
 */

public class ConsoleResultPrinter implements ResultPrinter {


    @Override
    public void print(Result result) {
        List<Device> devices = result.getDevices();
        System.out.print("All devices: ");
        for (Device device : devices) {
            System.out.print(device.getName() + " ");
        }
        System.out.println("\nNumber of connected devices: " + result.getNumberConnectedDevices());
        System.out.print("Connected devices: ");
        for (Device device : devices) {
            if (device.isConnected()) {
                System.out.print(device.getName() + " ");
            }
        }

        System.out.println("\nTotal power consumption: " + result.getCurrentPowerConsumption());

    }
}

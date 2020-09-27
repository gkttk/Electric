package com.github.gkttk.third.view;

import com.github.gkttk.third.model.Electricity;
import com.github.gkttk.third.model.device.Device;

import java.util.List;

/**
 * This class is responsible for console output
 */

public class ConsoleResultPrinter implements ResultPrinter {


    @Override
    public void print(Electricity electricity) {
        List<Device> devices = electricity.getDevices();
        System.out.print("All devices: ");
        for (Device device : devices) {
            System.out.print(device.getName() + " ");
        }
        System.out.println("\nNumber of connected devices: " + electricity.getDevices().size());
        System.out.print("Connected devices: ");
        for (Device device : devices) {
            System.out.print(device.getName() + " ");
        }

        System.out.println("\nTotal power consumption: " + electricity.getCurrentTotalPowerConsumption());

    }
}

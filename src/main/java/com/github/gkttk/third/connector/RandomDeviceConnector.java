package com.github.gkttk.third.connector;

import com.github.gkttk.third.model.device.Device;

import java.util.List;
import java.util.Random;

/**
 * This class plugs in a random number of devices from list.
 */

public class RandomDeviceConnector {

    /**
     * @param devices list of devices
     * @return number of plugged in devices
     */

    public int plugInRandomDevices(List<Device> devices) {
        Random random = new Random();

        int devicesNumber = devices.size();
        int countPlugInDevices = random.nextInt(devicesNumber + 1);

        for (int i = 0; i < countPlugInDevices; i++) {
            int deviceIndex = random.nextInt(devicesNumber);
            Device currentDevice = devices.get(deviceIndex);
            if (currentDevice.isConnected()) {    //if device is already plugged in
                i--;
            } else {
                currentDevice.plugIn();
            }
        }

        return countPlugInDevices;

    }

}

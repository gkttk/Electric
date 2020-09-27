package com.github.gkttk.third.data.creator;

import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.device.factory.DevicesFactory;
import com.github.gkttk.third.model.enums.DeviceType;

import java.util.Arrays;
import java.util.List;

/**
 * This class create devices
 */


public class DeviceCreator {

    private DevicesFactory devicesFactory;

    public DeviceCreator(DevicesFactory devicesFactory) {
        this.devicesFactory = devicesFactory;
    }

    /**
     * @return list with 5 different devices
     */
    public List<Device> createListOfDevices() {
        Device microwave = devicesFactory.createDevice(DeviceType.MICROWAVE);
        Device teapot = devicesFactory.createDevice(DeviceType.TEAPOT);
        Device television = devicesFactory.createDevice(DeviceType.TELEVISION);
        Device laptop = devicesFactory.createDevice(DeviceType.LAPTOP);
        Device washer = devicesFactory.createDevice(DeviceType.WASHER);
        return Arrays.asList(microwave, teapot, television, laptop, washer);
    }


}

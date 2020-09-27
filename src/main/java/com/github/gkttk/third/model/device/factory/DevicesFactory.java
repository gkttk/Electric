package com.github.gkttk.third.model.device.factory;

import com.github.gkttk.third.exception.WrongDeviceTypeException;
import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.enums.DeviceType;

/**
 * Simple factory of Devices
 */

public class DevicesFactory {

    public Device createDevice(DeviceType type) {
        switch (type) {
            case LAPTOP: {
                return new Device("Laptop", 100);
            }
            case TEAPOT: {
                return new Device("Teapot", 1500);
            }
            case WASHER: {
                return new Device("Washer", 1000);
            }
            case MICROWAVE: {
                return new Device("Microwave", 650);
            }
            case TELEVISION: {
                return new Device("Television", 250);
            }
            default: {
                throw new WrongDeviceTypeException("Current type is not supported", type);
            }
        }

    }

}

package com.github.gkttk.third.exception;

import com.github.gkttk.third.model.enums.DeviceType;

/**
 * Unchecked exception which trows when DevicesFactory gains not supportable type of device
 */
public class WrongDeviceTypeException extends RuntimeException {

    public WrongDeviceTypeException(String message, DeviceType wrongType) {
        super(message);
        System.out.println("This type of device is not support" + wrongType.name());
    }
}

package com.github.gkttk.third.model.factory;

import com.github.gkttk.third.exception.WrongDeviceTypeException;
import com.github.gkttk.third.model.device.*;
import com.github.gkttk.third.model.enums.DeviceType;

public class DevicesFactory {

    public Device createDevice(DeviceType type){
        if(type == DeviceType.LAPTOP){
            return new Laptop();
        }else if(type == DeviceType.MICROWAVE){
            return new Microwave();
        }
        else if(type == DeviceType.TEAPOT){
            return new Teapot();
        }
        else if(type == DeviceType.TELEVISION){
            return new Television();
        }
        else if(type == DeviceType.WASHER){
            return new Washer();
        }
        else {
            throw new WrongDeviceTypeException("Current type is not supported", type);
        }
    }

}

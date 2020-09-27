package com.github.gkttk.third;

import com.github.gkttk.third.data.creator.DeviceCreator;
import com.github.gkttk.third.model.Electricity;
import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.device.factory.DevicesFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CurrentPowerDevicesHandlerTest {

    private final DeviceCreator deviceCreator = new DeviceCreator(new DevicesFactory());


    @Test
    public void testCheckDevicesWhenCountDevicesEqualsZero() {
        //given
        Electricity electricity = new Electricity();
        //when
        double zeroPower = electricity.getCurrentTotalPowerConsumption();
        //then
        Assertions.assertEquals(0.0, zeroPower);
    }

    @Test
    public void testCheckDevicesWhenCountDevicesIsFive() {
        //given
        List<Device> devices = deviceCreator.createListOfDevices();
        Electricity electricity = new Electricity();
        electricity.plugInDevices(devices);
        double powerConsumptionSum = 0.0; //expected value
        for (Device device : devices) {
            powerConsumptionSum += device.getPowerConsumption();
        }
        //when
        double result = electricity.getCurrentTotalPowerConsumption();
        //then
        Assertions.assertEquals(powerConsumptionSum, result, 0.01);

    }


}

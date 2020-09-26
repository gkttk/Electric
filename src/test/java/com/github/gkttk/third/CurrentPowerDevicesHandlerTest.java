package com.github.gkttk.third;

import com.github.gkttk.third.logic.CurrentPowerDevicesHandler;
import com.github.gkttk.third.logic.DevicesHandler;
import com.github.gkttk.third.model.device.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CurrentPowerDevicesHandlerTest {
    private static DevicesHandler currentPowerDevicesHandler;

    @BeforeAll
    static void init() {
        currentPowerDevicesHandler = new CurrentPowerDevicesHandler();
    }


    @Test
    public void testCheckDevicesWhenCountDevicesEqualsZero() {
        List<Device> zeroDevices = new ArrayList<>();
        double zeroPower = currentPowerDevicesHandler.processDevices(zeroDevices);
        Assertions.assertEquals(0.0, zeroPower);
    }

    @Test
    public void testCheckDevicesWhenCountConnectedDevicesIsThree() {
        Device microwave = new Microwave();
        microwave.plugIn();
        Device teapot = new Teapot();
        teapot.plugIn();
        Device laptop = new Laptop();
        laptop.plugIn();
        double threeDevicesPowerConsumption = microwave.getPowerConsumption() + teapot.getPowerConsumption() + laptop.getPowerConsumption(); //expected value
        List<Device> devices = Arrays.asList(new Television(), new Washer(), microwave, teapot, laptop);
        double result = currentPowerDevicesHandler.processDevices(devices);
        Assertions.assertEquals(threeDevicesPowerConsumption, result);
    }


}

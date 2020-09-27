package com.github.gkttk.third;

import com.github.gkttk.third.data.creator.DeviceCreator;
import com.github.gkttk.third.model.Electricity;
import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.device.factory.DevicesFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ElectricityTest {

    private final DeviceCreator deviceCreator = new DeviceCreator(new DevicesFactory());


    @Test
    public void testPlugInDevicesWhenListOfDevicesIsEmpty() {
        //given
        List<Device> devices = new ArrayList<>();
        int expectedNumberOfDevices = 0;
        Electricity electricityWithoutDevices = new Electricity();
        //when
        electricityWithoutDevices.plugInDevices(devices);
        //then
        Assertions.assertEquals(expectedNumberOfDevices, electricityWithoutDevices.getDevices().size());
    }

    @Test
    public void testPlugInDeviceShouldAddOneExtraDevice() {
        //given
        List<Device> initDevices = deviceCreator.createListOfDevices();
        Electricity electricity = new Electricity();
        electricity.plugInDevices(initDevices);
        Device device = new Device("TestDevice", 3000);
        int expectedNumberOfDevices = electricity.getDevices().size() + 1; //6
        double expectedCurrentPowerConsumption = electricity.getCurrentTotalPowerConsumption() + 3000;
        //when
        electricity.plugInDevice(device);
        //then
        Assertions.assertEquals(expectedNumberOfDevices, electricity.getDevices().size());
        Assertions.assertEquals(expectedCurrentPowerConsumption, electricity.getCurrentTotalPowerConsumption());
    }

    @Test
    public void testPlugOutDeviceShouldRemoveDevice() {
        //given
        List<Device> initDevices = deviceCreator.createListOfDevices();
        Electricity electricity = new Electricity();
        electricity.plugInDevices(initDevices);
        Device deviceFromElectricity = electricity.getDevices().get(0);
        int expectedNumberOfDevices = electricity.getDevices().size() - 1; //4
        double expectedCurrentPowerConsumption = electricity.getCurrentTotalPowerConsumption() - deviceFromElectricity.getPowerConsumption();
        //when
        electricity.plugOutDevice(deviceFromElectricity);
        //then
        Assertions.assertEquals(expectedNumberOfDevices, electricity.getDevices().size());
        Assertions.assertEquals(expectedCurrentPowerConsumption, electricity.getCurrentTotalPowerConsumption());

    }

}

package com.github.gkttk.third;

import com.github.gkttk.third.data.creator.DeviceCreator;
import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.device.factory.DevicesFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DeviceCreatorTest {

    private final DeviceCreator deviceCreator = new DeviceCreator(new DevicesFactory());


    @Test
    public void testCreateListOfDevicesShouldReturnListWithFiveDevices() {
        //given
        int expectedListSize = 5;
        //when
        List<Device> devices = deviceCreator.createListOfDevices();
        //then
        Assertions.assertEquals(expectedListSize, devices.size());
    }
    

}

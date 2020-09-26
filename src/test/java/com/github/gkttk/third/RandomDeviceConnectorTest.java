package com.github.gkttk.third;

import com.github.gkttk.third.connector.RandomDeviceConnector;
import com.github.gkttk.third.model.device.Device;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RandomDeviceConnectorTest {

    private static RandomDeviceConnector randomDeviceConnector;

    @BeforeAll
    static void init() {
        randomDeviceConnector = new RandomDeviceConnector();
    }


    @Test
    public void testPlugInRandomDevicesWhenCountOfDevicesEqualsZero() {
        List<Device> zeroDevices = new ArrayList<>();
        int countConnectedDevices = randomDeviceConnector.plugInRandomDevices(zeroDevices);
        Assertions.assertEquals(0, countConnectedDevices);
    }

}

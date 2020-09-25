package com.github.gkttk.third;

import com.github.gkttk.third.connector.RandomDeviceConnector;
import com.github.gkttk.third.logic.DevicesHandler;
import com.github.gkttk.third.logic.factory.CurrentPowerDevicesHandlerFactory;
import com.github.gkttk.third.logic.factory.DevicesHandlerFactory;
import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.enums.DeviceType;
import com.github.gkttk.third.model.factory.DevicesFactory;
import com.github.gkttk.third.model.result.Result;
import com.github.gkttk.third.view.ResultPrinter;
import com.github.gkttk.third.view.factory.ConsoleResultPrinterFactory;
import com.github.gkttk.third.view.factory.ResultPrinterFactory;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creating devices for work
        DevicesFactory devicesFactory = new DevicesFactory();

        Device microwave = devicesFactory.createDevice(DeviceType.MICROWAVE);
        Device teapot = devicesFactory.createDevice(DeviceType.TEAPOT);
        Device television = devicesFactory.createDevice(DeviceType.TELEVISION);
        Device laptop = devicesFactory.createDevice(DeviceType.LAPTOP);
        Device washer = devicesFactory.createDevice(DeviceType.WASHER);

        //adding devices to list(added 5 devices)
        List<Device> devices = Arrays.asList(microwave, teapot, television, laptop, washer);

        //plugging in random devices from list
        RandomDeviceConnector randomDeviceConnector = new RandomDeviceConnector();
        int connectedDevices = randomDeviceConnector.plugInRandomDevices(devices);

        //calculating total sum of power consumption of plugged in devices
        DevicesHandlerFactory devicesHandlerFactory = new CurrentPowerDevicesHandlerFactory();
        DevicesHandler currentPowerDevicesHandler = devicesHandlerFactory.createDevicesHandler();
        double powerSum = currentPowerDevicesHandler.processDevices(devices);

        //output
        ResultPrinterFactory resultPrinterFactory = new ConsoleResultPrinterFactory();
        ResultPrinter consoleResultPrinterFactory = resultPrinterFactory.createPrinter();
        Result result = new Result(devices, connectedDevices, powerSum);
        consoleResultPrinterFactory.print(result);


    }
}

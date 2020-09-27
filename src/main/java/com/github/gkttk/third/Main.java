package com.github.gkttk.third;

import com.github.gkttk.third.data.creator.DeviceCreator;
import com.github.gkttk.third.model.Electricity;
import com.github.gkttk.third.model.device.Device;
import com.github.gkttk.third.model.device.factory.DevicesFactory;
import com.github.gkttk.third.view.ResultPrinter;
import com.github.gkttk.third.view.factory.ConsoleResultPrinterFactory;
import com.github.gkttk.third.view.factory.ResultPrinterFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //creating devices for work(DeviceCreator crates 5 devices)
        DeviceCreator deviceCreator = new DeviceCreator(new DevicesFactory());
        List<Device> devices = deviceCreator.createListOfDevices();

        //creating an socket object
        Electricity electricity = new Electricity();

        //plugging in devices
        electricity.plugInDevices(devices);

        //output
        ResultPrinterFactory resultPrinterFactory = new ConsoleResultPrinterFactory();
        ResultPrinter consoleResultPrinterFactory = resultPrinterFactory.createPrinter();
        consoleResultPrinterFactory.print(electricity);


    }
}

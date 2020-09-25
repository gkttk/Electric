package com.github.gkttk.third.logic.factory;

import com.github.gkttk.third.logic.CurrentPowerDevicesHandler;
import com.github.gkttk.third.logic.DevicesHandler;

public class CurrentPowerDevicesHandlerFactory implements DevicesHandlerFactory {
    @Override
    public DevicesHandler createDevicesHandler() {
        return new CurrentPowerDevicesHandler();
    }
}

package com.github.gkttk.third.view.factory;

import com.github.gkttk.third.view.ConsoleResultPrinter;
import com.github.gkttk.third.view.ResultPrinter;

public class ConsoleResultPrinterFactory implements ResultPrinterFactory {

    @Override
    public ResultPrinter createPrinter() {
        return new ConsoleResultPrinter();
    }
}

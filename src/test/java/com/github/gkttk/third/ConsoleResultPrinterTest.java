package com.github.gkttk.third;

import com.github.gkttk.third.model.result.Result;
import com.github.gkttk.third.view.ConsoleResultPrinter;
import com.github.gkttk.third.view.ResultPrinter;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class ConsoleResultPrinterTest {

    private static ByteArrayOutputStream newOut;
    private static PrintStream defaultOut;
    private static ResultPrinter consoleResultPrinter;

    @BeforeAll
    static void init() {
        defaultOut = System.out;
        newOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(newOut));
        consoleResultPrinter = new ConsoleResultPrinter();
    }

    @Test

    public void testPrint() {
        String expectedString = "All devices: \nNumber of connected devices: 0\r\nConnected devices: \nTotal power consumption: 0.0\r\n";
        Result testResult = new Result(new ArrayList<>(), 0, 0.0);
        consoleResultPrinter.print(testResult);
        Assertions.assertEquals(expectedString, newOut.toString());
    }


    @AfterAll
    static void destroy() {
        System.setOut(defaultOut);
    }

}

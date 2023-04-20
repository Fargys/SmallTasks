package com.denisov.patterns.structural;

import com.denisov.patterns.structural.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeTest {


    public static final String JAVA_BANK_SYSTEM    = "java bank system";
    public static final String CPP_STOCK_EXCHANGE = "C++ stock exchange";
    public static final String CPP_BANK_SYSTEM     = "C++ bank system";
    public static final String JAVA_STOCK_EXCHANGE = "java stock exchange";

    @Test
    void test() {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        assertEquals(JAVA_BANK_SYSTEM, programs[0].developProgram());
        assertEquals(CPP_STOCK_EXCHANGE, programs[1].developProgram());
    }

    @Test
    void test1() {
        Program[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        assertEquals(CPP_BANK_SYSTEM, programs[0].developProgram());
        assertEquals(JAVA_STOCK_EXCHANGE, programs[1].developProgram());
    }
}

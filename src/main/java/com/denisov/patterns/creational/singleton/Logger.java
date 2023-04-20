package com.denisov.patterns.creational.singleton;

public class Logger {
    private static Logger logger;
    private static String logFile = "";

    private Logger() {

    }

    public static synchronized Logger getLogger() {
        if(logger == null)
            logger = new Logger();

        return logger;
    }

    public static void addLogInfo(String info) {
        logFile += info;
    }

    public static String getLogInfo() {
        return logFile;
    }
}

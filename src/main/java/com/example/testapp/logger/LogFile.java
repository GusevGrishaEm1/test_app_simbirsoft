package com.example.testapp.logger;


import java.io.IOException;
import java.util.logging.*;

import java.io.FileInputStream;

public class LogFile {

    public static Logger LOGGER;

    private static final String fileName = "log.config";

    static {
        try(FileInputStream file = new FileInputStream(fileName)){
            LogManager.getLogManager().readConfiguration(file);
            LOGGER = Logger.getLogger(LogFile.class.getName());
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}

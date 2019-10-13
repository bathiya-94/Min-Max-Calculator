package ui;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MessageLogger {
    private  static final Logger LOGGER = Logger.getLogger( MessageLogger.class.getName() );

    private MessageLogger() {
        throw new IllegalStateException("Utility class");
    }

    public static void logMessage(String message){
        LOGGER.log(Level.INFO, message);
    }
}


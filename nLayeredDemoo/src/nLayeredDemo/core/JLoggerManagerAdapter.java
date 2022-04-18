package nLayeredDemo.core;

import nLayeredDemo.jlogger.LoggerManager;

public class JLoggerManagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        LoggerManager loggerManager=new LoggerManager();
        loggerManager.log(message);
    }
}

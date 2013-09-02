package com.xuwakao.mixture;

/**
 * Created by xuwakao on 13-8-28.
 */
public class ServiceConfig {
    private boolean debuggable = false;
    public static final String LOG_FILE_NAME = "log.txt";

    public static final String EXTERNAL_DIR = "xuwakao";

    private static ServiceConfig config;

    private ServiceConfig(){

    }

    public static ServiceConfig getInstance(){
        if(config == null){
            config = new ServiceConfig();
        }

        return config;
    }

    /**
     * set the debuggable
     * @param debuggable
     */
    public void setDebuggable(boolean debuggable){
        this.debuggable = debuggable;
    }

    /**
     * @return debuggable
     */
    public boolean isDebuggable(){
        return this.debuggable;
    }
}
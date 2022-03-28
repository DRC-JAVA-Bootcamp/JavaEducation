package com.egitim.ucuncuhafta.cmt.designpattern.builder;

public class Client {
    public static void main(String[] args) {
        Log log = new Log.Builder().logType("error").build();
        String logMessage = log.getLogMessage();
        if(logMessage == null){

        }
        System.out.println(log.toString());

      //  Log2 log2 = new Log2("birinci log", "error", null, null, null );

    }
}

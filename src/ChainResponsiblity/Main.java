package ChainResponsiblity;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(null));
        logObj.log(LogProcessor.ERROR,"exception happens");
        logObj.log(LogProcessor.INFO,"just for info");
        logObj.log(LogProcessor.DEBUG,"need to debug this");

    }
}

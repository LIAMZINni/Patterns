public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile="its log file \n";
    public static ProgramLogger getInstance(){
        if(programLogger==null){
            programLogger= new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){


    }
    public static void addLogInfo(String info){
        logFile+=info+"\n";
    }
    public static void getLogInfo(){
        System.out.println(logFile);
    }
}

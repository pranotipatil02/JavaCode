public class LoggerImple {
    public static void main(String[] args) {
        Logger log=new Logger();
        log.debug("Debug leve: "+log.debugLevel);//1

        log.debugLevel=7;
        log.info("Info at level : "+log.debugLevel);//7
    }
    
}

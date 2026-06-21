import java.time.LocalDateTime;
public class Logger{

    private static volatile Logger instance;

    private Logger(){
        System.out.println("================================");
        System.out.println(" Logger Initialized");
        System.out.println(" Developed by: Shubham Sangram Bej");
        System.out.println("================================");
    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized(Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message){
        System.out.println("[" + LocalDateTime.now() + "] LOG: " + message);
    }
}
public class SingletonTest{

    public static void main(String[] args){

        System.out.println("================================");
        System.out.println(" Singleton Pattern Demonstration");
        System.out.println("================================");

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("\nChecking Singleton Pattern...\n");

        if(logger1 == logger2){
            System.out.println("SUCCESS: Both references point to the same Logger object.");
        } else {
            System.out.println("ERROR: Different Logger objects were created.");
        }

        System.out.println();

        logger1.log("Application started.");
        logger2.log("Processing user request.");
        logger1.log("Singleton pattern verified successfully.");
    }
}
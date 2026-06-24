public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Decorator Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        // Base notification channel
        Notifier notifier = new EmailNotifier();

        // Add WhatsApp notification dynamically
        notifier = new WhatsAppNotifierDecorator(notifier);

        // Add Teams notification dynamically
        notifier = new TeamsNotifierDecorator(notifier);

        System.out.println("\nSending Notifications Through Multiple Channels...\n");

        notifier.send("Hi, I am Shubham Sangram Bej. Nice to meet you!!.");

        System.out.println("\nNotification Process Completed Successfully.");
    }
}
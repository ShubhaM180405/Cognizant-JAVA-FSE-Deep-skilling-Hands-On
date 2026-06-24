public class EmailNotifier implements Notifier{

    @Override
    public void send(String message){

        System.out.println("Email Notification Sent");
        System.out.println("Message : " + message);
    }
}
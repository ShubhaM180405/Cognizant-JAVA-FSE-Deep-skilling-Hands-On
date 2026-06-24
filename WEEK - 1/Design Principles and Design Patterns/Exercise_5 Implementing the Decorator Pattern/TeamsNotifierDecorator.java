// Similar to the SlackNotifierDecorator that is mentioned as an example in the question

public class TeamsNotifierDecorator extends NotifierDecorator{

    public TeamsNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String message){

        super.send(message);

        sendTeamsNotification(message);
    }

    private void sendTeamsNotification(String message){

        System.out.println("Microsoft Teams Notification Sent");
        System.out.println("Message : " + message);
    }
}
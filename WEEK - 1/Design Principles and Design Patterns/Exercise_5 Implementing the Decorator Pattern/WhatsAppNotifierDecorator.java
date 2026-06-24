// Similar to the SMSNotifierDecorator that is mentioned as an example in the question

public class WhatsAppNotifierDecorator extends NotifierDecorator{

    public WhatsAppNotifierDecorator(Notifier notifier){
        super(notifier);
    }

    @Override
    public void send(String message){

        super.send(message);

        sendWhatsAppNotification(message);
    }

    private void sendWhatsAppNotification(String message){

        System.out.println("WhatsApp Notification Sent");
        System.out.println("Message : " + message);
    }
}
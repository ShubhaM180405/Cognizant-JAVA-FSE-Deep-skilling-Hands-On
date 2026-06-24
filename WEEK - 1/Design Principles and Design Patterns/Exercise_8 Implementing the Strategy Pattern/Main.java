public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Strategy Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567898765432", "Shubham Sangram Bej");

        PaymentStrategy payPalPayment = new PayPalPayment("shubhambej9@gmail.com");

        PaymentContext paymentContext = new PaymentContext(creditCardPayment);

        System.out.println("\nProcessing First Payment...\n");

        paymentContext.executePayment(25000.00);

        paymentContext.setPaymentStrategy(payPalPayment);

        System.out.println("\nProcessing Second Payment...\n");

        paymentContext.executePayment(2500.00);

        System.out.println("\nStrategy Pattern Executed Successfully.");
    }
}
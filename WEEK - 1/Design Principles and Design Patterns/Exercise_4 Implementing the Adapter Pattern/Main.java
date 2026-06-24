public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Adapter Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        PaymentProcessor googlePay =
                new GooglePayAdapter(
                        new GooglePayGateway()
                );

        PaymentProcessor phonePe =
                new PhonePeAdapter(
                        new PhonePeGateway()
                );

        System.out.println("\n----- Processing Payments -----\n");

        googlePay.processPayment(6999.00);

        System.out.println();

        phonePe.processPayment(10000.00);

        System.out.println("\nAll Payments Processed Successfully.");
    }
}
public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Observer Pattern Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        StockMarket stockMarket =
                new StockMarket("Hindustan Unilever Limited", 1700.00);

        Observer mobileUser =
                new MobileApp("Shubham");

        Observer webUser =
                new WebApp("Investor's_Portal");

        System.out.println("\nRegistering Observers...\n");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        System.out.println("\nFirst Stock Price Change");

        stockMarket.setStockPrice(1950.00);

        System.out.println("\nRemoving Web Observer...\n");

        stockMarket.deregisterObserver(webUser);

        System.out.println("\nSecond Stock Price Change");

        stockMarket.setStockPrice(2250.00);

        System.out.println(
                "\nObserver Pattern Executed Successfully."
        );
    }
}
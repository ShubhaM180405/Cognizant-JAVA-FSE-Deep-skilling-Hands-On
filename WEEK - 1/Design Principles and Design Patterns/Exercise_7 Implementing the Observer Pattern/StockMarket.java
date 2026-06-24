import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{

    private String stockName;
    private double stockPrice;

    private List<Observer> observers;

    public StockMarket(String stockName, double stockPrice){

        this.stockName = stockName;
        this.stockPrice = stockPrice;

        observers = new ArrayList<>();
    }

    public void setStockPrice(double stockPrice){

        this.stockPrice = stockPrice;

        System.out.println("\nStock Price Updated!!!");

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){

        observers.add(observer);

        System.out.println(
                observer.getClass().getSimpleName()
                + " Registered Successfully."
        );
    }

    @Override
    public void deregisterObserver(Observer observer){

        observers.remove(observer);

        System.out.println(
                observer.getClass().getSimpleName()
                + " Deregistered Successfully."
        );
    }

    @Override
    public void notifyObservers(){

        for (Observer observer : observers){

            observer.update(stockName, stockPrice);
        }
    }
}
import java.util.Scanner;

class Order{

    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString(){
        return "Order ID : " + orderId + " | Customer : " + customerName + " | Price : Rs." + totalPrice;
    }
}

public class OrderSorting{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println(" Sorting Customer Orders");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        System.out.print("\nEnter number of orders : ");
        int n = sc.nextInt();
        sc.nextLine();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++){
            System.out.println("\nOrder no. " + (i + 1));

            System.out.print("Order ID : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Customer Name : ");
            String name = sc.nextLine();

            System.out.print("Total Price : ");
            double price = sc.nextDouble();
            sc.nextLine();

            orders[i] = new Order(id, name, price);
        }

        Order[] bubbleOrders = orders.clone();
        Order[] quickOrders = orders.clone();

        System.out.println("\nUNSORTED ORDERS");
        displayOrders(orders);

        long startBubble = System.nanoTime();
        bubbleSort(bubbleOrders);
        long endBubble = System.nanoTime();

        System.out.println("\nORDERS SORTED USING BUBBLE SORT");
        displayOrders(bubbleOrders);

        long bubbleTime = endBubble - startBubble;

        long startQuick = System.nanoTime();
        quickSort(quickOrders, 0, quickOrders.length - 1);
        long endQuick = System.nanoTime();

        System.out.println("\nORDERS SORTED USING QUICK SORT");
        displayOrders(quickOrders);

        long quickTime = endQuick - startQuick;

        System.out.println("\n========== PERFORMANCE ==========");
        System.out.println("Bubble Sort Time : " + bubbleTime + " ns");

        System.out.println("Quick Sort Time  : " + quickTime + " ns");

        if (quickTime < bubbleTime){
            System.out.println("Quick Sort performed faster.");
        }
        else{
            System.out.println("Bubble Sort performed faster.");
        }

        sc.close();
    }

    static void displayOrders(Order[] orders){

        for (Order order : orders){
            System.out.println(order);
        }
    }

    static void bubbleSort(Order[] orders){

        int n = orders.length;

        for (int i = 0; i < n - 1; i++){

            for (int j = 0; j < n - i - 1; j++){

                if (orders[j].totalPrice > orders[j + 1].totalPrice){
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    static void quickSort(Order[] orders, int low, int high){

        if (low < high){
            int pivotIndex = partition(orders, low, high);
            quickSort(orders, low, pivotIndex - 1);

            quickSort(orders, pivotIndex + 1, high);
        }
    }

    static int partition(Order[] orders, int low, int high){

        double pivot = orders[high].totalPrice;

        int i = low - 1;

        for (int j = low; j < high; j++){

            if (orders[j].totalPrice <= pivot){
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }
}
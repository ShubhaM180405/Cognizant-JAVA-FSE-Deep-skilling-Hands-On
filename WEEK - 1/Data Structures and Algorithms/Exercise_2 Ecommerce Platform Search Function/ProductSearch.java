import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Product Class
class Product {

    int productId;
    String productName;
    String category;

    // Constructor
    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID : " + productId +
               ", Name : " + productName +
               ", Category : " + category;
    }
}

public class ProductSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int productId) {

        for (Product product : products) {

            if (product.productId == productId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int productId) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (products[mid].productId == productId) {
                return products[mid];
            }

            if (products[mid].productId < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println(" E-Commerce Platform Search Function");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("========================================");

        System.out.print("\nEnter Number of Products : ");
        int numberOfProducts = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[numberOfProducts];

        // Input Product Details
        for (int i = 0; i < numberOfProducts; i++) {

            System.out.println("\nEnter Details for Product " + (i + 1));

            System.out.print("Product ID : ");
            int productId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Product Name : ");
            String productName = scanner.nextLine();

            System.out.print("Category : ");
            String category = scanner.nextLine();

            products[i] = new Product(productId, productName, category);
        }

        // Sort Products for Binary Search
        Arrays.sort(products, new Comparator<Product>() {

            @Override
            public int compare(Product a, Product b) {

                if (a.productId < b.productId)
                    return -1;
                else if (a.productId > b.productId)
                    return 1;
                else
                    return 0;
            }
        });

        // Display Products
        System.out.println("\n========== Available Products ==========");

        for (Product product : products) {
            System.out.println(product);
        }

        // Search Input
        System.out.print("\nEnter Product ID to Search : ");
        int searchId = scanner.nextInt();

        // Linear Search Timing
        long linearStart = System.nanoTime();

        Product linearResult = linearSearch(products, searchId);

        long linearEnd = System.nanoTime();

        long linearTime = linearEnd - linearStart;

        // Binary Search Timing
        long binaryStart = System.nanoTime();

        Product binaryResult = binarySearch(products, searchId);

        long binaryEnd = System.nanoTime();

        long binaryTime = binaryEnd - binaryStart;

        // Linear Search Result
        System.out.println("\n========== Linear Search ==========");

        if (linearResult != null) {
            System.out.println("Product Found");
            System.out.println(linearResult);
        } else {
            System.out.println("Product Not Found");
        }

        // Binary Search Result
        System.out.println("\n========== Binary Search ==========");

        if (binaryResult != null) {
            System.out.println("Product Found");
            System.out.println(binaryResult);
        } else {
            System.out.println("Product Not Found");
        }

        // Performance Comparison
        System.out.println("\n========== Performance Comparison ==========");

        System.out.println("Linear Search Time : " + linearTime + " ns");
        System.out.println("Binary Search Time : " + binaryTime + " ns");

        if (linearTime < binaryTime) {
            System.out.println("Linear Search was faster for this execution.");
        }
        else if (binaryTime < linearTime) {
            System.out.println("Binary Search was faster for this execution.");
        }
        else {
            System.out.println("Both searches took approximately the same time.");
        }

        System.out.println("\nNote:");
        System.out.println("For large datasets, Binary Search is generally more efficient");
        System.out.println("because its time complexity is O(log n) compared to O(n)");
        System.out.println("for Linear Search.");

        System.out.println("\nSearch Operation Completed Successfully.");

        scanner.close();
    }
}
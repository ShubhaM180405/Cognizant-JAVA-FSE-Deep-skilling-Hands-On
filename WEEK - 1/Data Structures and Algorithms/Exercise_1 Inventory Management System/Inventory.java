import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory{

    private List<Product> products;

    public Inventory(){
        products = new ArrayList<>();
    }

    // Add Product
    public void addProduct(Product product){
        products.add(product);
        System.out.println("Product Added Successfully!");
    }

    // Update Product
    public void updateProduct(int productId, String productName, int quantity, double price){

        boolean found = false;

        for (Product product : products){
            if (product.getProductId() == productId){

                product.setProductName(productName);
                product.setQuantity(quantity);
                product.setPrice(price);

                System.out.println("Product ID " + productId + " Updated Successfully.");
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Invalid Product ID.");
        }
    }

    // Delete Product
    public boolean deleteProduct(int productId){

        for (Product product : products) {

            if (product.getProductId() == productId){

                products.remove(product);

                System.out.println("Product ID " + productId + " Deleted Successfully.");
                return true;
            }
        }

        System.out.println("Invalid Product ID.");
        return false;
    }

    // Display Products
    public void displayProducts(){

        if (products.isEmpty()){
            System.out.println("Inventory is Empty.");
            return;
        }

        System.out.println("\n----- Product List -----");

        for (Product product : products){
            System.out.println(product);
        }

        System.out.println("Total Products : " + products.size());
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" Inventory Management System");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("====================================\n");

        Inventory inventory = new Inventory();

        char choice = 'y';

        while (choice == 'y' || choice == 'Y'){

            System.out.print("Enter Product ID : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Quantity : ");
            int quantity = sc.nextInt();

            System.out.print("Enter Price : ");
            double price = sc.nextDouble();

            Product product = new Product(id, name, quantity, price);

            inventory.addProduct(product);

            System.out.print("\nAdd Another Product? (y/n): ");
            choice = sc.next().charAt(0);

            System.out.println();
        }

        System.out.println("\nProducts in Inventory:");
        inventory.displayProducts();

        System.out.print("\nEnter Product ID to Update: ");
        int updateId = sc.nextInt();

        inventory.updateProduct(updateId,
                "ASUS ROG Gaming Laptop",
                5,
                105000.00);

        System.out.println("\nInventory After Update:");
        inventory.displayProducts();

        System.out.print("\nEnter Product ID to Delete: ");
        int deleteId = sc.nextInt();

        inventory.deleteProduct(deleteId);

        System.out.println("\nInventory After Deletion:");
        inventory.displayProducts();

        sc.close();
    }
}
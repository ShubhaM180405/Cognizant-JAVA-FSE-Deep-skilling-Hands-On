public class Main{

    public static void main(String[] args){

        System.out.println("======================================");
        System.out.println(" Dependency Injection Example");
        System.out.println(" Developed By : Shubham Sangram Bej");
        System.out.println("======================================");

        // Create Repository Object
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject Dependency through Constructor
        CustomerService customerService = new CustomerService(repository);

        System.out.println("\nFetching the Customer Details you asked for...\n");

        Customer customer = customerService.getCustomer(106);

        System.out.println("Customer ID   : " + customer.getId());

        System.out.println("Customer Name : " + customer.getName());

        System.out.println("\nDependency Injection Executed Successfully.");
    }
}
public class CustomerRepositoryImpl implements CustomerRepository{

    @Override
    public Customer findCustomerById(int id){

        System.out.println("Searching customer that you asked in our repository...");

        return new Customer(id, "Shubham Sangram Bej");
    }
}
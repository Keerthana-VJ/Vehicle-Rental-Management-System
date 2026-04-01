package Service;

import Model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public static List<Customer> customers=new ArrayList<>();

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public Customer getCustomer(int id) {
        for (Customer c : customers) {
            if (c.getCustomerId() == id) return c;
        }
        return null;
    }
}
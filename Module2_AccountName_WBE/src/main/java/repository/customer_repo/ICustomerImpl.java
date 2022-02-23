package repository.customer_repo;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerImpl {
    public void create(Customer customer);

    public Customer findById(int id);

    public void edit(int id,Customer customer);

    public void delete(int id);

    public List<Customer> showAll();

    public List<Customer> search(String name);

}

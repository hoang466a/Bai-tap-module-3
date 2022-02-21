package repository.customer_repo;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerImpl {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer findById(int id);

    public boolean editCustomer(Customer customer) throws SQLException;

    public boolean deleteCustomer(int id) throws SQLException;

    public List<Customer> showAllCustomer();

}

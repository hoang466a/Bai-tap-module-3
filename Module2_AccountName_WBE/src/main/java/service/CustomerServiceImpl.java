package service;

import model.Customer;
import repository.customer_repo.CustomerImpl;
import service.Iservice.ICustomerServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements ICustomerServiceImpl {
    CustomerImpl customerimpl=new CustomerImpl();

    @Override
    public List<Customer> showAll() {
        return customerimpl.showAllCustomer();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void create(Customer customer) {
        try {
            customerimpl.insertCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void edit(int id) {

    }
}

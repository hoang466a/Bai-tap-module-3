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
        return customerimpl.showAll();
    }

    @Override
    public List<Customer> search(String name) {
        return customerimpl.search(name);
    }

    @Override
    public void delete(int id) {
    customerimpl.delete(id);
    }

    @Override
    public void create(Customer customer) {
            customerimpl.create(customer);
    }

    @Override
    public Customer findById(int id) {
        return customerimpl.findById(id);
    }

    @Override
    public void edit(Customer customer) {

        customerimpl.edit(customer);
    }
}

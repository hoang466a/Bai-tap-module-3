package service.Iservice;

import model.Customer;

import java.util.List;

public interface ICustomerServiceImpl {
    List<Customer> showAll();
    void delete(int id);
    void create(Customer customer);
    void edit (int id);

}

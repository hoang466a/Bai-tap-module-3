package service;

import model.CustomerType;
import repository.customer_repo.CustomerTypeImpl;
import service.Iservice.ICustomerTypeServiceImpl;

import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeServiceImpl {
    CustomerTypeImpl customerType=new CustomerTypeImpl();
    @Override
    public List<CustomerType> getAllCustomerType() {
        return customerType.getAllCustomerType();
    }
}

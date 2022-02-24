package repository.customer_repo;

import repository.ConnectDB;
import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements ICustomerImpl {
    private ConnectDB connectDB = new ConnectDB();



    @Override
    public void create(Customer customer) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.connectDB.getConnection().prepareStatement("insert into customer(customer_code,customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address)values(?,?,?,?,?,?,?,?,?)");

            preparedStatement.setString(1, customer.getCodeCustomer());
            preparedStatement.setInt(2, customer.getTypeIdCustomer());
            preparedStatement.setString(3, customer.getNameCustomer());
            preparedStatement.setString(4, customer.getBirthdayCustomer());
            preparedStatement.setBoolean(5, customer.getGenderCustomer());
            preparedStatement.setString(6, customer.getIdCardCustomer());
            preparedStatement.setString(7, customer.getPhoneCustomer());
            preparedStatement.setString(8, customer.getEmailCustomer());
            preparedStatement.setString(9, customer.getAddressCustomer());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.connectDB.getConnection().prepareStatement("select customer_code,customer_type_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address from customer where customer_id=?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String customerCode = resultSet.getString("customer_code");
                int customerTypeId = resultSet.getInt("customer_type_id");
                String customerName = resultSet.getString("customer_name");
                String customerBirthday = resultSet.getString("customer_birthday");
                boolean customerGender = resultSet.getBoolean("customer_gender");
                String customerIdCard = resultSet.getString("customer_id_card");
                String customerPhone = resultSet.getString("customer_phone");
                String customerEmail = resultSet.getString("customer_email");
                String customerAddress = resultSet.getString("customer_address");
                customer = new Customer(customerCode, customerTypeId, customerName, customerBirthday, customerGender, customerIdCard, customerPhone, customerEmail, customerAddress);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void edit(Customer customer) {


        try {
            PreparedStatement preparedStatement = this.connectDB.getConnection().prepareStatement("update customer set customer_code=?,customer_type_id=?,customer_name=?,customer_birthday=?,customer_gender=?,"+
                   " customer_id_card=?,customer_phone=?,customer_email=?,customer_address=? where customer_id=?");
//            PreparedStatement preparedStatement = this.connectDB.getConnection().prepareStatement("update customer" +
//                    "set customer_code=?,customer_type_id=?,customer_name=?,customer_birthday=?,customer_gender=?," +
//                    "customer_id_card=?,customer_phone=?,customer_email=?,customer_address=? where customer_id=?");

            preparedStatement.setString(1, customer.getCodeCustomer());
            preparedStatement.setInt(2, customer.getTypeIdCustomer());
            preparedStatement.setString(3, customer.getNameCustomer());
            preparedStatement.setString(4, customer.getBirthdayCustomer());
            preparedStatement.setBoolean(5, customer.getGenderCustomer());
            preparedStatement.setString(6, customer.getIdCardCustomer());
            preparedStatement.setString(7, customer.getPhoneCustomer());
            preparedStatement.setString(8, customer.getEmailCustomer());
            preparedStatement.setString(9, customer.getAddressCustomer());
            preparedStatement.setInt(10, customer.getIdCustomer());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            PreparedStatement preparedStatement = this.connectDB.getConnection().prepareStatement("delete from customer where customer_id=?");
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> showAll() {
        List<Customer> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connectDB.getConnection().
                    prepareStatement("select * from customer_type join customer on customer_type.customer_type_id=customer.customer_type_id order by customer_id");
            ResultSet resultSet = preparedStatement.executeQuery();
            Customer customer;
            while (resultSet.next()) {
                customer = new Customer();
                customer.setIdCustomer(resultSet.getInt("customer_id"));
                customer.setTypeIdCustomer(resultSet.getInt("customer_type_id"));
                customer.setNameCustomer(resultSet.getString("customer_name"));
                customer.setBirthdayCustomer(resultSet.getString("customer_birthday"));
                customer.setGenderCustomer(resultSet.getBoolean("customer_gender"));
                customer.setIdCardCustomer(resultSet.getString("customer_id_card"));
                customer.setPhoneCustomer(resultSet.getString("customer_phone"));
                customer.setEmailCustomer(resultSet.getString("customer_email"));
                customer.setAddressCustomer(resultSet.getString("customer_address"));
                customer.setTypeNameCustomer(resultSet.getString("customer_type_name"));
                list.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Customer> search(String name) {
        ResultSet resultSet;
        List<Customer> list = new ArrayList<>();
        Customer customer;
        try {
            PreparedStatement preparedStatement = this.connectDB.getConnection().prepareStatement("select * from customer join customer_type on customer.customer_type_id=customer_type.customer_type_id where customer_name like ?");
            preparedStatement.setString(1, "%" + name + "%");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                customer = new Customer();
                customer.setCodeCustomer(resultSet.getString("customer_code"));
                customer.setTypeIdCustomer(resultSet.getInt("customer_type_id"));
                customer.setNameCustomer(resultSet.getString("customer_name"));
                customer.setBirthdayCustomer(resultSet.getString("customer_birthday"));
                customer.setGenderCustomer(resultSet.getBoolean("customer_gender"));
                customer.setIdCardCustomer(resultSet.getString("customer_id_card"));
                customer.setPhoneCustomer(resultSet.getString("customer_phone"));
                customer.setEmailCustomer(resultSet.getString("customer_email"));
                customer.setAddressCustomer(resultSet.getString("customer_address"));
                customer.setTypeNameCustomer(resultSet.getString("customer_type_name"));
                list.add(customer);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

package repository.customer_repo;

import repository.ConnectDB;
import model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerImpl implements ICustomerImpl {
    private ConnectDB connectDB=new ConnectDB();
    /*private String jdbcURL="jdbc:mysql://localhost:3306/furama_data";
    private String jdbcUsername="root";
    private String jdbcPassword="000000";

    private Connection connection;
    CustomerImpl customerImpl=new CustomerImpl();


    public CustomerImpl() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public Connection getConnection(){return connection;}*/







    @Override
    public void insertCustomer(Customer customer) throws SQLException {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public boolean editCustomer(Customer customer) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return false;
    }

    @Override
    public List<Customer> showAllCustomer()  {
        List<Customer>list=new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connectDB.getConnection().
                    prepareStatement("select * from customer_type join customer on customer_type.customer_type_id=customer.customer_type_id");
            ResultSet resultSet=preparedStatement.executeQuery();
            Customer customer;
            while(resultSet.next()){
                customer=new Customer();
                customer.setIdCustomer(resultSet.getInt("customer_id"));
                customer.setTypeIdCustomer(resultSet.getInt("customer_type_id"));
                customer.setNameCustomer(resultSet.getString("customer_name") );
                customer.setBirthdayCustomer(resultSet.getString("customer_birthday"));
                customer.setGenderCustomer(resultSet.getBoolean("customer_gender"));
                customer.setIdCardCustomer(resultSet.getString("customer_id_card"));
                customer.setPhoneCustomer(resultSet.getString("customer_phone"));
                customer.setEmailCustomer(resultSet.getString("customer_email"));
                customer.setAddressCustomer(resultSet.getString("customer_address"));
                customer.setTypeNameCustomer(resultSet.getString("customer_type_name"));
                list.add(customer);
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return list;
    }
}

package repository.customer_repo;

import model.Customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CustomerImpl implements ICustomerImpl {
    private String jdbcURL="jdbc:mysql://localhost:3306/furama_data";
    private String jdbcUsername="root";
    private String jdbcPassword="000000";

    private Connection connection;


    public CustomerImpl(){

    }

    public BaseRepository(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection= DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);
        } catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }




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
    public List<Customer> showAllCustomer() {
        PreparedStatement preparedStatement=this.base
        return null;
    }
}

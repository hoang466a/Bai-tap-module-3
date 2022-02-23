package repository.customer_repo;

import model.CustomerType;
import repository.ConnectDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeImpl implements ICustomerTypeImpl{
    private ConnectDB connectDB=new ConnectDB();
    @Override
    public List<CustomerType> getAllCustomerType() {
        List<CustomerType>customerTypeList=new ArrayList<>();
        try {
            PreparedStatement preparedStatement=this.connectDB.getConnection().prepareStatement("select *from customer_type");
            ResultSet resultSet=preparedStatement.executeQuery();
            while(resultSet.next())
            {
                int customerTypeId=resultSet.getInt("customer_type_id");
                String customerTypeName=resultSet.getString("customer_type_name");
                customerTypeList.add(new CustomerType(customerTypeId,customerTypeName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypeList;
    }
}

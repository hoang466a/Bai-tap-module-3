package repository.ProductRepo;

import model.Product;
import repository.ConnectDB;
import repository.IProductRepo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    ConnectDB connectDB = new ConnectDB();

    @Override
    public void create(Product product) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = this.connectDB.getConnection().prepareStatement("insert into `category` (name_product,price_product,quantity_product,color_product,des_product,cate_product)values(?,?,?,?,?,?)");

            preparedStatement.setString(1, product.getNameProduct());
            preparedStatement.setInt(2, product.getPriceProduct());
            preparedStatement.setInt(3, product.getQuantityProduct());
            preparedStatement.setString(4, product.getColorProduct());
            preparedStatement.setString(5, product.getDesProduct());
            preparedStatement.setString(6, product.getCateProduct());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Product findById(int id) {
        return null;
    }

    @Override
    public void edit(Product product) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Product> showAll() {
        List<Product> list = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = this.connectDB.getConnection().
                    prepareStatement("select * from `category` order by id_product;");
            ResultSet resultSet = preparedStatement.executeQuery();
            Product product;
            while (resultSet.next()) {

                product = new Product();
                product.setIdProduct(resultSet.getInt("id_product"));
                product.setNameProduct(resultSet.getString("name_product"));
                product.setPriceProduct(resultSet.getInt("price_product"));
                product.setQuantityProduct(resultSet.getInt("quantity_product"));
                product.setColorProduct(resultSet.getString("color_product"));
                product.setDesProduct(resultSet.getString("des_product"));
                product.setCateProduct(resultSet.getString("cate_product"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Product> search(String name) {
        return null;
    }
}

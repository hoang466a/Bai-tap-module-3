package service;

import model.Product;

import java.util.List;

public interface ProductServive {
    List<Product> findAll();
    void create (Product product);
    void update (int id, Product product);
    void delete(int id);
    Product searchById(int id);
}

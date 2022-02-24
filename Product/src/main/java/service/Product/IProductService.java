package service.Product;

import model.Product;

import java.util.List;

public interface IProductService {
    public void create(Product product);

    public Product findById(int id);

    public void edit(Product product);

    public void delete(int id);

    public List<Product> showAll();

    public List<Product> search(String name);
}

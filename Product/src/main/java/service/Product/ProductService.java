package service.Product;

import model.Product;
import repository.ProductRepo.ProductRepo;

import java.util.List;

public class ProductService implements IProductService{
    ProductRepo productRepo=new ProductRepo();
    @Override
    public void create(Product product) {
        productRepo.create(product);
    }

    @Override
    public Product findById(int id) {
        return productRepo.findById(id);
    }

    @Override
    public void edit(Product product) {
        productRepo.edit(product);
    }

    @Override
    public void delete(int id) {
        productRepo.delete(id);
    }

    @Override
    public List<Product> showAll() {
        return productRepo.showAll();
    }

    @Override
    public List<Product> search(String name) {
        return productRepo.search(name);
    }
}

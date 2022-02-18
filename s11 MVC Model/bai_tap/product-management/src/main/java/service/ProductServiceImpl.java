package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product>products;
    static{
        products=new HashMap<>();
        products.put(1,new Product(1,"May Lanh",23000,"dieu hoa hai chieu","Nhat Ban"));
        products.put(2,new Product(2,"Tu Lanh",30000,"tu lanh 3 ngan","My"));
        products.put(3,new Product(3,"Bep Tu",40000,"bep tu xin xo 4 ngan","Kangaroo"));
        products.put(4,new Product(4,"Tu Dong",50000,"tu dong 2 ngan","Kawaga"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<Product>(products.values());
    }



    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void delete(int id) {
        products.remove(id);
    }

    @Override
    public Product searchById(int id) {
        return products.get(id);
    }
}

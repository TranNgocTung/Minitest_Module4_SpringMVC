package service;

import model.Product;

import java.util.*;

public class ProductService implements IProductService {
    private static Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Gạo tẻ","Tẻ thơm","18-12-2000"));
        products.put(2,new Product(2,"Gạo xoan","Khô", "04-06-2020"));
        products.put(3,new Product(3,"Gạo nếp","Nếp cái hoa vàng", "05-07-2021"));
        products.put(4,new Product(4,"Gạo khang dân","Miền bắc", "03-01-2022"));
        products.put(5,new Product(5,"Gạo lứt","Miền núi", "04-05-20203"));


    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);

    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id,product);

    }

    @Override
    public void delete(int id) {
        products.remove(id);

    }
}

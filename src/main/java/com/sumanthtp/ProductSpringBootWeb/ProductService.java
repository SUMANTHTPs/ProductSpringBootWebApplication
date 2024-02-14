package com.sumanthtp.ProductSpringBootWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ProductService {
    List<Product> products = new ArrayList<Product>();
    @Autowired
    ProductDB db;
    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProductByName(String name) {
        return db.findByName(name);
    }

    public void addProduct(Product p) {
        db.save(p);
    }
}
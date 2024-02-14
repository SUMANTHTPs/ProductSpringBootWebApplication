package com.sumanthtp.ProductSpringBootWeb;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDB extends JpaRepository<Product, Integer> {
    Product findByName(String name);
}

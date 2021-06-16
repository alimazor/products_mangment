package com.products_managment.dao;

import com.products_managment.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsDao extends JpaRepository<Product, Long> {
}

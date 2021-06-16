package com.products_managment;

import com.products_managment.dao.ProductsDao;
import com.products_managment.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsManagmentApplication implements CommandLineRunner {
    @Autowired
    private ProductsDao productsRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProductsManagmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*productsRepository.save(new Product("AZE153","PC ACER","PC ACER 4 GO 500 GO DISK , INTEL 440 ",60,4500.00));
        productsRepository.save(new Product("AZE152","PC ASUS","PC ASUS 8 GO 1 T DISK , NVIDIA 960 ",25,7500.00));
        productsRepository.save(new Product("AZE151","PC HP","PC HP 4 GO 500 GO DISK , INTEL 440 ",20,3500.00));*/
    }
}

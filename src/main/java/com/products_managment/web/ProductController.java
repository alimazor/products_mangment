package com.products_managment.web;

import com.products_managment.dao.ProductsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductsDao productsDao;


    @RequestMapping("/index")
    private String index(){
        return "index";
    }
}

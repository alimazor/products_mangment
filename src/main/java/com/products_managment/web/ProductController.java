package com.products_managment.web;

import com.products_managment.dao.ProductsDao;
import com.products_managment.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductsDao productsDao;


    @RequestMapping("/index")
    private String index(Model model, @RequestParam(name = "page",defaultValue = "0")int p,@RequestParam(name = "size",defaultValue = "5") int s){

        Page<Product> productList = productsDao.findAll(PageRequest.of(p,s));
        model.addAttribute("productList",productList.getContent());
        return "index";
    }



}

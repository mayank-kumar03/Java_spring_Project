package com.example.SimpleWebApp.controller;


import com.example.SimpleWebApp.Services.ProductServices;
import com.example.SimpleWebApp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    @Autowired
    ProductServices service;
    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }
@PostMapping("/products")
    public  void addProduct(@RequestBody Product prod){
        service.addProducts(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
         service.deleteProductById(prodId);
    }

}

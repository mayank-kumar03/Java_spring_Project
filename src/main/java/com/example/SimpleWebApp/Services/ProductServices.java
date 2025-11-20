package com.example.SimpleWebApp.Services;

import com.example.SimpleWebApp.model.Product;
import com.example.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class ProductServices {
    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll() ;
    }
    public Product getProductById(int prodId){
       return repo.findById(prodId).orElse(new Product());

    }

    public void addProducts(Product prod ){
        repo.save(prod);
    }


    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProductById(int prodId) {
        repo.deleteById(prodId);


    }
}

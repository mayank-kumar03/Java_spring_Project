package com.example.SimpleWebApp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
@Component
@Entity
public class Product {
    @Id
    private int proId;
    private String prodName;
    private int price;
    public  Product(){}

    public Product(int proId, String prodName, int price) {
        this.proId = proId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

package com.SimpleWebApp.FirstWebApp.Services;

import com.SimpleWebApp.FirstWebApp.Models.Product;
import com.SimpleWebApp.FirstWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService{

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int productId) {
        return repo.findById(productId).orElse(new Product());
    }

    public void addProducts(Product product) {
        repo.save(product);
    }

    public void updateProducts(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
       repo.deleteById(prodId);
    }


}

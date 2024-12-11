package com.SimpleWebApp.FirstWebApp.Controllers;

import com.SimpleWebApp.FirstWebApp.Models.Product;
import com.SimpleWebApp.FirstWebApp.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product product){
        service.addProducts(product);
    }

    @PutMapping("/products")
    public void updateProducts(@RequestBody Product prod){
        service.updateProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@RequestBody int prodId){
        service.deleteProduct(prodId);
    }
}

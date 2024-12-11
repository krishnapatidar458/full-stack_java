package com.SimpleWebApp.FirstWebApp.repository;

import com.SimpleWebApp.FirstWebApp.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {

}

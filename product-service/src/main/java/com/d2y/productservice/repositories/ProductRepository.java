package com.d2y.productservice.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.d2y.productservice.models.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}

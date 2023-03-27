package com.d2y.productservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.d2y.productservice.dto.ProductRequest;
import com.d2y.productservice.dto.ProductResponse;
import com.d2y.productservice.models.Product;
import com.d2y.productservice.repositories.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

  private final ProductRepository productRepository;

  public void createProduct(ProductRequest productRequest) {
    Product product = Product.builder()
        .name(productRequest.getName())
        .description(productRequest.getDescription())
        .price(productRequest.getPrice())
        .build();

    productRepository.save(product);
    log.info("Product {} has been saved!", product.getId());
  }

  public List<ProductResponse> getAllProduct() {
    List<Product> products = productRepository.findAll();

    return products.stream().map(product -> mapProductResponse(product)).toList();
  }

  private ProductResponse mapProductResponse(Product product) {

    return ProductResponse.builder()
        .id(product.getId())
        .name(product.getName())
        .description(product.getDescription())
        .price(product.getPrice())
        .build();

  }

}

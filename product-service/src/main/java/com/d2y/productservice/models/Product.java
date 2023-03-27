package com.d2y.productservice.models;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Document(value = "products")
@AllArgsConstructor
@Builder
@Data
public class Product {
  @Id
  private String id;

  private String name;
  private String description;
  private BigDecimal price;
}

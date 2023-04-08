package com.d2y.inventoryservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.d2y.inventoryservice.dto.InventoryResponse;
import com.d2y.inventoryservice.services.InventoryService;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/inventory")
@RequiredArgsConstructor
public class InventoryController {

  private final InventoryService inventoryService;

  // http://localhost:5002/api/inventory/iphone-13,iphone13-red

  // http://localhost:5002/api/inventory?skuCode=iphone-13&skuCode=iphone13-red
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
    return inventoryService.isInStock(skuCode);
  }
}

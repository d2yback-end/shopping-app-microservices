package com.d2y.inventoryservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d2y.inventoryservice.models.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
  List<Inventory> findBySkuCodeIn(List<String> skuCode);
}

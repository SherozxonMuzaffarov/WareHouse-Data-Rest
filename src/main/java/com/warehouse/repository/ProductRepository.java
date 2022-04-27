package com.warehouse.repository;

import com.warehouse.entity.Product;
import com.warehouse.projection.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Long> {
}

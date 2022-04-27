package com.warehouse.repository;

import com.warehouse.entity.InputProduct;
import com.warehouse.projection.InputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct",excerptProjection = InputProductProjection.class)
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}

package com.warehouse.repository;

import com.warehouse.entity.OutputProduct;
import com.warehouse.projection.OutputProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct", excerptProjection = OutputProductProjection.class)
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}

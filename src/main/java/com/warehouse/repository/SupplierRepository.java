package com.warehouse.repository;

import com.warehouse.entity.Supplier;
import com.warehouse.projection.SupplierProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "supplier", excerptProjection = SupplierProjection.class)
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}

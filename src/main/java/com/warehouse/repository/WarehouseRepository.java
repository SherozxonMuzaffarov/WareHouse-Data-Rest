package com.warehouse.repository;

import com.warehouse.entity.WareHouse;
import com.warehouse.projection.WareHouseProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",excerptProjection = WareHouseProjection.class)
public interface WarehouseRepository extends JpaRepository<WareHouse, Long> {
}

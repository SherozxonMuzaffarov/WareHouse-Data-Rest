package com.warehouse.repository;

import com.warehouse.entity.Output;
import com.warehouse.projection.OutputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output", excerptProjection = OutputProjection.class)
public interface OutputRepository extends JpaRepository<Output, Long> {
}

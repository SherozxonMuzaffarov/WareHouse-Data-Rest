package com.warehouse.repository;

import com.warehouse.entity.Measurement;
import com.warehouse.projection.MeasurementProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "measurement", excerptProjection = MeasurementProjection.class)
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
}

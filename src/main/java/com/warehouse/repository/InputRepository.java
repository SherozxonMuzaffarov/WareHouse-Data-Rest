package com.warehouse.repository;

import com.warehouse.entity.Input;
import com.warehouse.projection.InputProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "input", excerptProjection = InputProjection.class)
public interface InputRepository extends JpaRepository<Input, Long> {
}

package com.warehouse.repository;

import com.warehouse.entity.Category;
import com.warehouse.projection.CategoryProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Long> {
}

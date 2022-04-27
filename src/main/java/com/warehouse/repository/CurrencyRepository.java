package com.warehouse.repository;

import com.warehouse.entity.Currency;
import com.warehouse.projection.CurrencyProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = CurrencyProjection.class)
public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}

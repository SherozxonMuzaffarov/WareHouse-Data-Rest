package com.warehouse.projection;

import com.warehouse.entity.Currency;
import com.warehouse.projection.template.AbsProjection;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CurrencyProjection extends AbsProjection {
}

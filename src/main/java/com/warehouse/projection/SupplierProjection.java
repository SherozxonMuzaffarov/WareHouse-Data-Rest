package com.warehouse.projection;

import com.warehouse.entity.Supplier;
import com.warehouse.projection.template.AbsProjection;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Supplier.class)
public interface SupplierProjection extends AbsProjection {

    String getPhoneNumber();
}

package com.warehouse.projection;

import com.warehouse.entity.WareHouse;
import com.warehouse.projection.template.AbsProjection;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = WareHouse.class)
public interface WareHouseProjection extends AbsProjection {
}

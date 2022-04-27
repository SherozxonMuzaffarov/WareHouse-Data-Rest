package com.warehouse.projection;

import com.warehouse.entity.Measurement;
import com.warehouse.projection.template.AbsProjection;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface MeasurementProjection extends AbsProjection {
}

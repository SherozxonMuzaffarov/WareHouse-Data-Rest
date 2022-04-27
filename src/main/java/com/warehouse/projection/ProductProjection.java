package com.warehouse.projection;

import com.warehouse.entity.Attachment;
import com.warehouse.entity.Category;
import com.warehouse.entity.Measurement;
import com.warehouse.entity.Product;
import com.warehouse.projection.template.AbsProjection;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductProjection extends AbsProjection {

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}

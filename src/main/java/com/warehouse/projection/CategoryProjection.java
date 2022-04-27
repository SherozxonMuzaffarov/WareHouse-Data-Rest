package com.warehouse.projection;

import com.warehouse.entity.Category;
import com.warehouse.projection.template.AbsProjection;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryProjection extends AbsProjection {

     Category getParentCategory();
}

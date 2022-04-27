package com.warehouse.projection;

import com.warehouse.entity.Output;
import com.warehouse.entity.OutputProduct;
import com.warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = OutputProduct.class)
public interface OutputProductProjection {
     Long getId();

     Double getAmount();

     Double getPrice();

     Product getProduct();

     Output getOutput();
}

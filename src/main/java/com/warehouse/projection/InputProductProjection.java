package com.warehouse.projection;

import com.warehouse.entity.Input;
import com.warehouse.entity.InputProduct;
import com.warehouse.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductProjection {

     Long getId();

     Double getAmount();

     Double getPrice();

     Date getExpireDate();

     Product getProduct();

     Input getInput();
}

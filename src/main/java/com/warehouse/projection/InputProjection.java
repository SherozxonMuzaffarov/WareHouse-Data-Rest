package com.warehouse.projection;

import com.warehouse.entity.Currency;
import com.warehouse.entity.Input;
import com.warehouse.entity.Supplier;
import com.warehouse.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputProjection {

     Long getId();

     Timestamp getTimestamp();

     WareHouse getWareHouse();

     Supplier getSupplier();

     Currency getCurrency();

     String getFactureNumber();

     String getCode();
}

package com.warehouse.projection;

import com.warehouse.entity.Clients;
import com.warehouse.entity.Currency;
import com.warehouse.entity.Output;
import com.warehouse.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputProjection {

     Long getId();

     Timestamp getTimestamp();

     String getFactureNumber();

     String getCode();

     WareHouse getWareHouse();

     Clients getClient();

     Currency getCurrency();
}

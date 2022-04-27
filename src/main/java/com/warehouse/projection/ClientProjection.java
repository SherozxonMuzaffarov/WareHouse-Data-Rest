package com.warehouse.projection;

import com.warehouse.entity.Clients;
import com.warehouse.projection.template.AbsProjection;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Clients.class)
public interface ClientProjection extends AbsProjection {

    String getPhoneNumber();
}

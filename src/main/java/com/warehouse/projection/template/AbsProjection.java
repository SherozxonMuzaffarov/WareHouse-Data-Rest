package com.warehouse.projection.template;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public interface AbsProjection {

    long getId();

    String getName();

    boolean getActive();
}

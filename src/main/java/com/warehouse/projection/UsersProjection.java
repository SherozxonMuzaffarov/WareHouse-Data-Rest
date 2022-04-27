package com.warehouse.projection;

import com.warehouse.entity.Users;
import com.warehouse.entity.WareHouse;
import org.springframework.data.rest.core.config.Projection;

import java.util.Set;

@Projection(types = Users.class)
public interface UsersProjection {

     Long getId();

     String getFirstName();


     String getPhoneNumber();

     String getCode();

     String getPassword();

     boolean getActive();

     Set<WareHouse> getWareHouses();

}

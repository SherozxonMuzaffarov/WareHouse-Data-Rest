package com.warehouse.repository;

import com.warehouse.entity.Users;
import com.warehouse.projection.UsersProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user", excerptProjection = UsersProjection.class)
public interface UserRepository extends JpaRepository<Users, Long> {
}

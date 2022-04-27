package com.warehouse.repository;

import com.warehouse.entity.Clients;
import com.warehouse.projection.ClientProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client", excerptProjection = ClientProjection.class)
public interface ClientRepository extends JpaRepository<Clients, Long> {
}

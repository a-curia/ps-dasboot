package com.dbbyte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbbyte.model.Shipwreck;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}

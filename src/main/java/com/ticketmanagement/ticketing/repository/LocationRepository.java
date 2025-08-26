package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.LocationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<LocationEntity, Integer> {
}

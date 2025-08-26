package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.showtimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface showtimeRepository extends JpaRepository<showtimeEntity, Integer> {
}

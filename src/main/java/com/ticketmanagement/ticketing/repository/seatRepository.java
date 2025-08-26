package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.seatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface seatRepository extends JpaRepository<seatEntity, Integer> {
}

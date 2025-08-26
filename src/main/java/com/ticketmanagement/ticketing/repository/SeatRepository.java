package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.SeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<SeatEntity, Integer> {
}

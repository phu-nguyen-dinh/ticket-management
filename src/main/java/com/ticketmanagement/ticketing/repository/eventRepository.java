package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.eventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface eventRepository extends JpaRepository<eventEntity, Integer> {
}

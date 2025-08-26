package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<EventEntity, Integer> {
}

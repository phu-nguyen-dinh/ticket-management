package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}

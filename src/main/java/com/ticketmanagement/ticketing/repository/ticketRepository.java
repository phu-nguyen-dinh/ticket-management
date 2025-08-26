package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.paymentEntity;
import com.ticketmanagement.ticketing.model.entity.ticketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ticketRepository extends JpaRepository<ticketEntity, Integer> {
}

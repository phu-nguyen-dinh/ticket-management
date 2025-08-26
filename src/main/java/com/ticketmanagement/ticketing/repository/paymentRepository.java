package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.paymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentRepository extends JpaRepository<paymentEntity, Integer> {
}

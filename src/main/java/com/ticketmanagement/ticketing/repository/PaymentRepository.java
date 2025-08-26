package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Integer> {
}

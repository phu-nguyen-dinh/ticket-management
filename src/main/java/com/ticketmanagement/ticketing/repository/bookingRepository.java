package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.bookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookingRepository extends JpaRepository<bookingEntity, Integer> {

}

package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<BookingEntity, Integer> {

}

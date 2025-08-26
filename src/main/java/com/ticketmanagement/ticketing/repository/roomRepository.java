package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.roomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface roomRepository extends JpaRepository<roomEntity, Integer> {
}

package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.customerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository extends JpaRepository<customerEntity, Integer> {

}

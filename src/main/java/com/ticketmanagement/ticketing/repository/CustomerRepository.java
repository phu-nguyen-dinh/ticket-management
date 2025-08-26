package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}

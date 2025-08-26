package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userEntity, Integer> {
}

package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}

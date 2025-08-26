package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<RoomEntity, Integer> {
}

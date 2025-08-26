package com.ticketmanagement.ticketing.repository;

import com.ticketmanagement.ticketing.model.entity.ShowtimeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowtimeRepository extends JpaRepository<ShowtimeEntity, Integer> {
}

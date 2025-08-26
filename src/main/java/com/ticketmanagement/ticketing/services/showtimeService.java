package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.showtimeDTO;

import java.util.List;

public interface showtimeService {
    showtimeDTO createShowtime(showtimeDTO showtimeDTO);
    showtimeDTO getShowtimeById(Integer showtimeId);
    List<showtimeDTO> getAllShowtimes();
    showtimeDTO updateShowtime(Integer showtimeId, showtimeDTO showtimeDTO);
    void deleteShowtime(Integer showtimeId);
}

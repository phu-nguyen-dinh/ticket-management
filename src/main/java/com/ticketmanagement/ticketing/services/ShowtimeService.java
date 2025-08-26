package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.ShowtimeDTO;

import java.util.List;

public interface ShowtimeService {
    ShowtimeDTO createShowtime(ShowtimeDTO showtimeDTO);
    ShowtimeDTO getShowtimeById(Integer showtimeId);
    List<ShowtimeDTO> getAllShowtimes();
    ShowtimeDTO updateShowtime(Integer showtimeId, ShowtimeDTO showtimeDTO);
    void deleteShowtime(Integer showtimeId);
}

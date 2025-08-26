package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.SeatDTO;

import java.util.List;

public interface SeatService {
    SeatDTO createSeat(SeatDTO seatDTO);
    SeatDTO getSeatById(Integer seatId);
    List<SeatDTO> getAllSeats();
    SeatDTO updateSeat(Integer seatId, SeatDTO seatDTO);
    void deleteSeat(Integer seatId);
}

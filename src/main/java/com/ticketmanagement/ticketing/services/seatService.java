package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.seatDTO;

import java.util.List;

public interface seatService {
    seatDTO createSeat(seatDTO seatDTO);
    seatDTO getSeatById(Integer seatId);
    List<seatDTO> getAllSeats();
    seatDTO updateSeat(Integer seatId, seatDTO seatDTO);
    void deleteSeat(Integer seatId);
}

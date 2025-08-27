package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.SeatDTO;
import com.ticketmanagement.ticketing.services.SeatService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @PostMapping
    public SeatDTO createSeat(@RequestBody SeatDTO seatDTO) {
        return seatService.createSeat(seatDTO);
    }

    @GetMapping("/{id}")
    public SeatDTO getSeatById(@PathVariable Integer id) {
        return seatService.getSeatById(id);
    }

    @GetMapping
    public List<SeatDTO> getAllSeats() {
        return seatService.getAllSeats();
    }

    @PutMapping("/{id}")
    public SeatDTO updateSeat(@PathVariable Integer id, @RequestBody SeatDTO seatDTO) {
        return seatService.updateSeat(id, seatDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteSeat(@PathVariable Integer id) {
        seatService.deleteSeat(id);
    }
}
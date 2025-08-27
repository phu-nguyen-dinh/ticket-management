package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.ShowtimeDTO;
import com.ticketmanagement.ticketing.services.ShowtimeService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/showtimes")
public class ShowtimeController {

    @Autowired
    private ShowtimeService showtimeService;

    @PostMapping
    public ShowtimeDTO createShowtime(@RequestBody ShowtimeDTO showtimeDTO) {
        return showtimeService.createShowtime(showtimeDTO);
    }

    @GetMapping("/{id}")
    public ShowtimeDTO getShowtimeById(@PathVariable Integer id) {
        return showtimeService.getShowtimeById(id);
    }

    @GetMapping
    public List<ShowtimeDTO> getAllShowtimes() {
        return showtimeService.getAllShowtimes();
    }

    @PutMapping("/{id}")
    public ShowtimeDTO updateShowtime(@PathVariable Integer id, @RequestBody ShowtimeDTO showtimeDTO) {
        return showtimeService.updateShowtime(id, showtimeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteShowtime(@PathVariable Integer id) {
        showtimeService.deleteShowtime(id);
    }
}
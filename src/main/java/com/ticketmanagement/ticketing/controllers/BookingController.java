package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.BookingDTO;
import com.ticketmanagement.ticketing.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public BookingDTO createBooking(@RequestBody BookingDTO bookingDTO) {
        return bookingService.createBooking(bookingDTO);
    }

    @GetMapping("/{id}")
    public BookingDTO getBookingById(@PathVariable Integer id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping
    public List<BookingDTO> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PutMapping("/{id}")
    public BookingDTO updateBooking(@PathVariable Integer id, @RequestBody BookingDTO bookingDTO) {
        return bookingService.updateBooking(id, bookingDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBooking(id);
    }
}
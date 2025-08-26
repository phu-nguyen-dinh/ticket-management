package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.bookingDTO;

import java.util.List;

public interface bookingService {
    bookingDTO createBooking(bookingDTO bookingDTO);
    bookingDTO getBookingById(Integer bookingId);
    List<bookingDTO> getAllBookings();
    bookingDTO updateBooking(Integer bookingId, bookingDTO bookingDTO);
    void deleteBooking(Integer bookingId);
}

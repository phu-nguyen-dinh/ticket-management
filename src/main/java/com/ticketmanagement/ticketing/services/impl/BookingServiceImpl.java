package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.BookingDTO;
import com.ticketmanagement.ticketing.enums.BookingStatus;
import com.ticketmanagement.ticketing.model.entity.BookingEntity;
import com.ticketmanagement.ticketing.repository.BookingRepository;
import com.ticketmanagement.ticketing.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public BookingDTO createBooking(BookingDTO bookingDTO) {
        BookingEntity booking = new BookingEntity();
        booking.setBookingTime(bookingDTO.getBookingTime());
        booking.setTotalAmount(bookingDTO.getTotalAmount());
        booking.setStatus(BookingStatus.valueOf(bookingDTO.getStatus().toUpperCase()));
        bookingRepository.save(booking);
        bookingDTO.setBookingId(booking.getBookingId());
        return bookingDTO;
    }

    @Override
    public BookingDTO getBookingById(Integer bookingId) {
        return null;
    }

    @Override
    public List<BookingDTO> getAllBookings() {
        return List.of();
    }

    @Override
    public BookingDTO updateBooking(Integer bookingId, BookingDTO bookingDTO) {
        return null;
    }

    @Override
    public void deleteBooking(Integer bookingId) {

    }
}

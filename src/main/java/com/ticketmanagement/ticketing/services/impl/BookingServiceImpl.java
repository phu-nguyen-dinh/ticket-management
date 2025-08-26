package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.BookingDTO;
import com.ticketmanagement.ticketing.enums.BookingStatus;
import com.ticketmanagement.ticketing.mapper.BookingMapper;
import com.ticketmanagement.ticketing.model.entity.BookingEntity;
import com.ticketmanagement.ticketing.repository.BookingRepository;
import com.ticketmanagement.ticketing.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class BookingServiceImpl implements BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public BookingDTO createBooking(BookingDTO bookingDTO) {
        BookingEntity booking = BookingMapper.toEntity(bookingDTO);
        bookingRepository.save(booking);
        return BookingMapper.toDTO(booking);
    }

    @Override
    public BookingDTO getBookingById(Integer bookingId) {
        BookingEntity booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        return BookingMapper.toDTO(booking);
    }

    @Override
    public List<BookingDTO> getAllBookings() {
        return bookingRepository.findAll()
                .stream().map(BookingMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public BookingDTO updateBooking(Integer bookingId, BookingDTO bookingDTO) {
        BookingEntity booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        booking.setBookingTime(bookingDTO.getBookingTime());
        booking.setTotalAmount(bookingDTO.getTotalAmount());
        bookingRepository.save(booking);
        return BookingMapper.toDTO(booking);
    }

    @Override
    public void deleteBooking(Integer bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}

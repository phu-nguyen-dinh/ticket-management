package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.BookingDTO;
import com.ticketmanagement.ticketing.enums.BookingStatus;
import com.ticketmanagement.ticketing.model.entity.BookingEntity;

public class BookingMapper {

    public static BookingDTO toDTO(BookingEntity booking) {
        if (booking == null) return null;
        BookingDTO dto = new BookingDTO();
        dto.setBookingId(booking.getBookingId());
        dto.setUserId(booking.getUser() != null ? booking.getUser().getUserId() : null);
        dto.setCustId(booking.getCustomer() != null ? booking.getCustomer().getCustId() : null);
        dto.setBookingTime(booking.getBookingTime());
        dto.setTotalAmount(booking.getTotalAmount());
        dto.setStatus(booking.getStatus() != null ? booking.getStatus().name() : null);
        return dto;
    }

    public static BookingEntity toEntity(BookingDTO dto) {
        if (dto == null) return null;
        BookingEntity booking = new BookingEntity();
        booking.setBookingId(dto.getBookingId());
        booking.setBookingTime(dto.getBookingTime());
        booking.setTotalAmount(dto.getTotalAmount());
        if (dto.getStatus() != null) {
            booking.setStatus(BookingStatus.valueOf(dto.getStatus().toUpperCase()));
        }
        return booking;
    }
}

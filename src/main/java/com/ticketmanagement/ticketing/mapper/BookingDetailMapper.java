package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.BookingDetailDTO;
import com.ticketmanagement.ticketing.model.entity.BookingDetailEntity;

public class BookingDetailMapper {
    public static BookingDetailDTO toDTO(BookingDetailEntity detail) {
        if (detail == null) return null;
        BookingDetailDTO dto = new BookingDetailDTO();
        dto.setBookingDetailId(detail.getBookingDetailId());
        dto.setBookingId(detail.getBooking() != null ? detail.getBooking().getBookingId() : null);
        dto.setTicketId(detail.getTicket() != null ? detail.getTicket().getTicketId() : null);
        dto.setPrice(detail.getPrice());
        return dto;
    }

    public static BookingDetailEntity toEntity(BookingDetailDTO dto) {
        if (dto == null) return null;
        BookingDetailEntity detail = new BookingDetailEntity();
        detail.setBookingDetailId(dto.getBookingDetailId());
        detail.setPrice(dto.getPrice());
        return detail;
    }
}
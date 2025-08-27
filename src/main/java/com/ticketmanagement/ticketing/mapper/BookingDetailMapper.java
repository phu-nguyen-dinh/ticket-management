package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.BookingDetailDTO;
import com.ticketmanagement.ticketing.model.entity.BookingDetailEntity;

public class BookingDetailMapper {
    public static BookingDetailDTO toDTO(BookingDetailEntity detail) {
        if (detail == null) return null;
        BookingDetailDTO dto = new BookingDetailDTO();
        dto.setBooking_detail_id(detail.getBooking_detail_id());
        dto.setBooking_id(detail.getBooking() != null ? detail.getBooking().getBooking_id() : null);
        dto.setTicket_id(detail.getTicket() != null ? detail.getTicket().getTicket_id() : null);
        dto.setPrice(detail.getPrice());
        return dto;
    }

    public static BookingDetailEntity toEntity(BookingDetailDTO dto) {
        if (dto == null) return null;
        BookingDetailEntity detail = new BookingDetailEntity();
        detail.setBooking_detail_id(dto.getBooking_detail_id());
        detail.setPrice(dto.getPrice());
        return detail;
    }
}
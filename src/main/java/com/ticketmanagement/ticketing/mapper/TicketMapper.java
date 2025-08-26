package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.TicketDTO;
import com.ticketmanagement.ticketing.enums.TicketStatus;
import com.ticketmanagement.ticketing.model.entity.TicketEntity;

public class TicketMapper {

    public static TicketDTO toDTO(TicketEntity ticket) {
        if (ticket == null) return null;
        TicketDTO dto = new TicketDTO();
        dto.setTicketId(ticket.getTicketId());
        dto.setShowtimeId(ticket.getShowtime() != null ? ticket.getShowtime().getShowtimeId() : null);
        dto.setSeatId(ticket.getSeat() != null ? ticket.getSeat().getSeatId() : null);
        dto.setPrice(ticket.getPrice());
        dto.setStatus(ticket.getStatus() != null ? ticket.getStatus().name() : null);
        return dto;
    }

    public static TicketEntity toEntity(TicketDTO dto) {
        if (dto == null) return null;
        TicketEntity ticket = new TicketEntity();
        ticket.setTicketId(dto.getTicketId());
        ticket.setPrice(dto.getPrice());
        if (dto.getStatus() != null) {
            ticket.setStatus(TicketStatus.valueOf(dto.getStatus().toUpperCase()));
        }
        return ticket;
    }
}
package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.TicketDTO;
import com.ticketmanagement.ticketing.enums.TicketStatus;
import com.ticketmanagement.ticketing.model.entity.SeatEntity;
import com.ticketmanagement.ticketing.model.entity.ShowtimeEntity;
import com.ticketmanagement.ticketing.model.entity.TicketEntity;

public class TicketMapper {

    public static TicketDTO toDTO(TicketEntity ticket) {
        if (ticket == null) return null;
        TicketDTO dto = new TicketDTO();
        dto.setTicket_id(ticket.getTicket_id());
        dto.setShowtime_id(ticket.getShowtime() != null ? ticket.getShowtime().getShowtime_id() : null);
        dto.setSeat_id(ticket.getSeat() != null ? ticket.getSeat().getSeat_id() : null);
        dto.setPrice(ticket.getPrice());
        dto.setStatus(ticket.getStatus() != null ? ticket.getStatus().name() : null);
        return dto;
    }

    public static TicketEntity toEntity(TicketDTO dto) {
        if (dto == null) return null;
        TicketEntity ticket = new TicketEntity();
        ticket.setTicket_id(dto.getTicket_id());
        ticket.setPrice(dto.getPrice());
        if (dto.getStatus() != null) {
            ticket.setStatus(TicketStatus.valueOf(dto.getStatus()));
        }
        if (dto.getShowtime_id() != null) {
            ShowtimeEntity showtime = new ShowtimeEntity();
            showtime.setShowtime_id(dto.getShowtime_id());
            ticket.setShowtime(showtime);
        }
        if (dto.getSeat_id() != null) {
            SeatEntity seat = new SeatEntity();
            seat.setSeat_id(dto.getSeat_id());
            ticket.setSeat(seat);
        }
        return ticket;
    }
}
package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.TicketDTO;

import java.util.List;

public interface TicketService {
    TicketDTO createTicket(TicketDTO ticketDTO);
    TicketDTO getTicketById(Integer ticketId);
    List<TicketDTO> getAllTickets();
    TicketDTO updateTicket(Integer ticketId, TicketDTO ticketDTO);
    void deleteTicket(Integer ticketId);
}

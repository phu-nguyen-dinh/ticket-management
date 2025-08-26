package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.ticketDTO;

import java.util.List;

public interface ticketService {
    ticketDTO createTicket(ticketDTO ticketDTO);
    ticketDTO getTicketById(Integer ticketId);
    List<ticketDTO> getAllTickets();
    ticketDTO updateTicket(Integer ticketId, ticketDTO ticketDTO);
    void deleteTicket(Integer ticketId);
}

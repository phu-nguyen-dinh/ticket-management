package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.TicketDTO;
import com.ticketmanagement.ticketing.services.TicketService;

import java.util.List;

public class TicketServiceImpl implements TicketService {
    @Override
    public TicketDTO createTicket(TicketDTO ticketDTO) {
        return null;
    }

    @Override
    public TicketDTO getTicketById(Integer ticketId) {
        return null;
    }

    @Override
    public List<TicketDTO> getAllTickets() {
        return List.of();
    }

    @Override
    public TicketDTO updateTicket(Integer ticketId, TicketDTO ticketDTO) {
        return null;
    }

    @Override
    public void deleteTicket(Integer ticketId) {

    }
}

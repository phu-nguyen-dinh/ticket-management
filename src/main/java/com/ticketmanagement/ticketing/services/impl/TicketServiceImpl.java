package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.TicketDTO;
import com.ticketmanagement.ticketing.mapper.TicketMapper;
import com.ticketmanagement.ticketing.model.entity.TicketEntity;
import com.ticketmanagement.ticketing.repository.TicketRepository;
import com.ticketmanagement.ticketing.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public TicketDTO createTicket(TicketDTO ticketDTO) {
        TicketEntity ticket = TicketMapper.toEntity(ticketDTO);
        ticketRepository.save(ticket);
        return TicketMapper.toDTO(ticket);
    }

    @Override
    public TicketDTO getTicketById(Integer ticketId) {
        TicketEntity ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        return TicketMapper.toDTO(ticket);
    }

    @Override
    public List<TicketDTO> getAllTickets() {
        return ticketRepository.findAll()
                .stream().map(TicketMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public TicketDTO updateTicket(Integer ticketId, TicketDTO ticketDTO) {
        TicketEntity ticket = ticketRepository.findById(ticketId)
                .orElseThrow(() -> new RuntimeException("Ticket not found"));
        ticket.setPrice(ticketDTO.getPrice());
        ticketRepository.save(ticket);
        return TicketMapper.toDTO(ticket);
    }

    @Override
    public void deleteTicket(Integer ticketId) {
        ticketRepository.deleteById(ticketId);
    }
}

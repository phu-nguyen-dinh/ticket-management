package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.TicketDTO;
import com.ticketmanagement.ticketing.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @PostMapping
    public TicketDTO createTicket(@RequestBody TicketDTO ticketDTO) {
        return ticketService.createTicket(ticketDTO);
    }

    @GetMapping("/{id}")
    public TicketDTO getTicketById(@PathVariable Integer id) {
        return ticketService.getTicketById(id);
    }

    @GetMapping
    public List<TicketDTO> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @PutMapping("/{id}")
    public TicketDTO updateTicket(@PathVariable Integer id, @RequestBody TicketDTO ticketDTO) {
        return ticketService.updateTicket(id, ticketDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Integer id) {
        ticketService.deleteTicket(id);
    }
}
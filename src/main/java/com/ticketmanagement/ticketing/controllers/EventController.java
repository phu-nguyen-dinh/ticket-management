package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.EventDTO;
import com.ticketmanagement.ticketing.services.EventService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping
    public EventDTO createEvent(@RequestBody EventDTO eventDTO) {
        return eventService.createEvent(eventDTO);
    }

    @GetMapping("/{id}")
    public EventDTO getEventById(@PathVariable Integer id) {
        return eventService.getEventById(id);
    }

    @GetMapping
    public List<EventDTO> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PutMapping("/{id}")
    public EventDTO updateEvent(@PathVariable Integer id, @RequestBody EventDTO eventDTO) {
        return eventService.updateEvent(id, eventDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable Integer id) {
        eventService.deleteEvent(id);
    }
}

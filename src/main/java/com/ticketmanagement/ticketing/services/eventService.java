package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.eventDTO;

import java.util.List;

public interface eventService {
    eventDTO createEvent(eventDTO eventDTO);
    eventDTO getEventById(Integer eventId);
    List<eventDTO> getAllEvents();
    eventDTO updateEvent(Integer eventId, eventDTO eventDTO);
    void deleteEvent(Integer eventId);
}

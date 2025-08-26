package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.EventDTO;

import java.util.List;

public interface EventService {
    EventDTO createEvent(EventDTO eventDTO);
    EventDTO getEventById(Integer eventId);
    List<EventDTO> getAllEvents();
    EventDTO updateEvent(Integer eventId, EventDTO eventDTO);
    void deleteEvent(Integer eventId);
}

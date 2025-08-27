package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.EventDTO;
import com.ticketmanagement.ticketing.mapper.EventMapper;
import com.ticketmanagement.ticketing.model.entity.EventEntity;
import com.ticketmanagement.ticketing.repository.EventRepository;
import com.ticketmanagement.ticketing.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public EventDTO createEvent(EventDTO eventDTO) {
        EventEntity event = EventMapper.toEntity(eventDTO);
        eventRepository.save(event);
        return EventMapper.toDTO(event);
    }

    @Override
    public EventDTO getEventById(Integer eventId) {
        EventEntity event = eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found"));
        return EventMapper.toDTO(event);
    }

    @Override
    public List<EventDTO> getAllEvents() {
        return eventRepository.findAll()
                .stream().map(EventMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EventDTO updateEvent(Integer eventId, EventDTO eventDTO) {
        EventEntity event = eventRepository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found"));
        event.setTitle(eventDTO.getTitle());
        event.setDescription(eventDTO.getDescription());
        event.setType(eventDTO.getType());
        event.setStart_time(eventDTO.getStart_time());
        event.setEnd_time(eventDTO.getEnd_time());
        eventRepository.save(event);
        return EventMapper.toDTO(event);
    }

    @Override
    public void deleteEvent(Integer eventId) {
        eventRepository.deleteById(eventId);
    }
}

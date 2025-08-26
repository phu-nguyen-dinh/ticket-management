package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.EventDTO;
import com.ticketmanagement.ticketing.model.entity.EventEntity;

public class EventMapper {
    public static EventDTO toDTO(EventEntity event) {
        if (event == null) return null;
        EventDTO dto = new EventDTO();
        dto.setEventId(event.getEventId());
        dto.setTitle(event.getTitle());
        dto.setDescription(event.getDescription());
        dto.setType(event.getType());
        dto.setStartTime(event.getStartTime());
        dto.setEndTime(event.getEndTime());
        return dto;
    }

    public static EventEntity toEntity(EventDTO dto) {
        if (dto == null) return null;
        EventEntity event = new EventEntity();
        event.setEventId(dto.getEventId());
        event.setTitle(dto.getTitle());
        event.setDescription(dto.getDescription());
        event.setType(dto.getType());
        event.setStartTime(dto.getStartTime());
        event.setEndTime(dto.getEndTime());
        return event;
    }
}
package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.EventDTO;
import com.ticketmanagement.ticketing.model.entity.EventEntity;

public class EventMapper {
    public static EventDTO toDTO(EventEntity event) {
        if (event == null) return null;
        EventDTO dto = new EventDTO();
        dto.setEvent_id(event.getEvent_id());
        dto.setTitle(event.getTitle());
        dto.setDescription(event.getDescription());
        dto.setType(event.getType());
        dto.setStart_time(event.getStart_time());
        dto.setEnd_time(event.getEnd_time());
        return dto;
    }

    public static EventEntity toEntity(EventDTO dto) {
        if (dto == null) return null;
        EventEntity event = new EventEntity();
        event.setEvent_id(dto.getEvent_id());
        event.setTitle(dto.getTitle());
        event.setDescription(dto.getDescription());
        event.setType(dto.getType());
        event.setStart_time(dto.getStart_time());
        event.setEnd_time(dto.getEnd_time());
        return event;
    }
}
package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.ShowtimeDTO;
import com.ticketmanagement.ticketing.model.entity.ShowtimeEntity;

public class ShowtimeMapper {
    public static ShowtimeDTO toDTO(ShowtimeEntity showtime) {
        if (showtime == null) return null;
        ShowtimeDTO dto = new ShowtimeDTO();
        dto.setShowtimeId(showtime.getShowtimeId());
        dto.setEventId(showtime.getEvent() != null ? showtime.getEvent().getEventId() : null);
        dto.setRoomId(showtime.getRoom() != null ? showtime.getRoom().getRoomId() : null);
        dto.setStartTime(showtime.getStartTime());
        dto.setEndTime(showtime.getEndTime());
        return dto;
    }

    public static ShowtimeEntity toEntity(ShowtimeDTO dto) {
        if (dto == null) return null;
        ShowtimeEntity showtime = new ShowtimeEntity();
        showtime.setShowtimeId(dto.getShowtimeId());
        showtime.setStartTime(dto.getStartTime());
        showtime.setEndTime(dto.getEndTime());
        return showtime;
    }
}
package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.ShowtimeDTO;
import com.ticketmanagement.ticketing.model.entity.EventEntity;
import com.ticketmanagement.ticketing.model.entity.RoomEntity;
import com.ticketmanagement.ticketing.model.entity.ShowtimeEntity;

public class ShowtimeMapper {
    public static ShowtimeDTO toDTO(ShowtimeEntity showtime) {
        if (showtime == null) return null;
        ShowtimeDTO dto = new ShowtimeDTO();
        dto.setShowtime_id(showtime.getShowtime_id());
        dto.setEvent_id(showtime.getEvent() != null ? showtime.getEvent().getEvent_id() : null);
        dto.setRoom_id(showtime.getRoom() != null ? showtime.getRoom().getRoom_id() : null);
        dto.setStart_time(showtime.getStart_time());
        dto.setEnd_time(showtime.getEnd_time());
        return dto;
    }

    public static ShowtimeEntity toEntity(ShowtimeDTO dto) {
        if (dto == null) return null;
        ShowtimeEntity showtime = new ShowtimeEntity();
        showtime.setShowtime_id(dto.getShowtime_id());
        showtime.setStart_time(dto.getStart_time());
        showtime.setEnd_time(dto.getEnd_time());
        if (dto.getEvent_id() != null) {
            EventEntity event = new EventEntity();
            event.setEvent_id(dto.getEvent_id());
            showtime.setEvent(event);
        }
        if (dto.getRoom_id() != null) {
            RoomEntity room = new RoomEntity();
            room.setRoom_id(dto.getRoom_id());
            showtime.setRoom(room);
        }
        return showtime;
    }
}
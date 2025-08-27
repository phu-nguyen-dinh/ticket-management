package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.RoomDTO;
import com.ticketmanagement.ticketing.model.entity.RoomEntity;

public class RoomMapper {
    public static RoomDTO toDTO(RoomEntity room) {
        if (room == null) return null;
        RoomDTO dto = new RoomDTO();
        dto.setRoom_id(room.getRoom_id());
        dto.setLocation_id(room.getLocation() != null ? room.getLocation().getLocation_id() : null);
        dto.setRoom_name(room.getRoom_name());
        return dto;
    }

    public static RoomEntity toEntity(RoomDTO dto) {
        if (dto == null) return null;
        RoomEntity room = new RoomEntity();
        room.setRoom_id(dto.getRoom_id());
        room.setRoom_name(dto.getRoom_name());
        return room;
    }
}
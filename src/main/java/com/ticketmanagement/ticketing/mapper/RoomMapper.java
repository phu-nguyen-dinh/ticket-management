package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.RoomDTO;
import com.ticketmanagement.ticketing.model.entity.RoomEntity;

public class RoomMapper {
    public static RoomDTO toDTO(RoomEntity room) {
        if (room == null) return null;
        RoomDTO dto = new RoomDTO();
        dto.setRoomId(room.getRoomId());
        dto.setLocationId(room.getLocation() != null ? room.getLocation().getLocationId() : null);
        dto.setRoomName(room.getRoomName());
        return dto;
    }

    public static RoomEntity toEntity(RoomDTO dto) {
        if (dto == null) return null;
        RoomEntity room = new RoomEntity();
        room.setRoomId(dto.getRoomId());
        room.setRoomName(dto.getRoomName());
        return room;
    }
}
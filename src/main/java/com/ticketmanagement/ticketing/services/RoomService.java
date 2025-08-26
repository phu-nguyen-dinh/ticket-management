package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.RoomDTO;

import java.util.List;

public interface RoomService {
    RoomDTO createRoom(RoomDTO roomDTO);
    RoomDTO getRoomById(Integer roomId);
    List<RoomDTO> getAllRooms();
    RoomDTO updateRoom(Integer roomId, RoomDTO roomDTO);
    void deleteRoom(Integer roomId);
}

package com.ticketmanagement.ticketing.services;

import com.ticketmanagement.ticketing.dto.roomDTO;

import java.util.List;

public interface roomService {
    roomDTO createRoom(roomDTO roomDTO);
    roomDTO getRoomById(Integer roomId);
    List<roomDTO> getAllRooms();
    roomDTO updateRoom(Integer roomId, roomDTO roomDTO);
    void deleteRoom(Integer roomId);
}

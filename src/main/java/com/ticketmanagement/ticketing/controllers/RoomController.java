package com.ticketmanagement.ticketing.controllers;

import com.ticketmanagement.ticketing.dto.RoomDTO;
import com.ticketmanagement.ticketing.services.RoomService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping
    public RoomDTO createRoom(@RequestBody RoomDTO roomDTO) {
        return roomService.createRoom(roomDTO);
    }

    @GetMapping("/{id}")
    public RoomDTO getRoomById(@PathVariable Integer id) {
        return roomService.getRoomById(id);
    }

    @GetMapping
    public List<RoomDTO> getAllRooms() {
        return roomService.getAllRooms();
    }

    @PutMapping("/{id}")
    public RoomDTO updateRoom(@PathVariable Integer id, @RequestBody RoomDTO roomDTO) {
        return roomService.updateRoom(id, roomDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteRoom(@PathVariable Integer id) {
        roomService.deleteRoom(id);
    }
}

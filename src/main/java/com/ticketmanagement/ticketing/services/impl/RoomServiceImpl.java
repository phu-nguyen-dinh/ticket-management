package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.RoomDTO;
import com.ticketmanagement.ticketing.mapper.RoomMapper;
import com.ticketmanagement.ticketing.model.entity.RoomEntity;
import com.ticketmanagement.ticketing.repository.RoomRepository;
import com.ticketmanagement.ticketing.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public RoomDTO createRoom(RoomDTO roomDTO) {
        RoomEntity room = RoomMapper.toEntity(roomDTO);
        roomRepository.save(room);
        return RoomMapper.toDTO(room);
    }

    @Override
    public RoomDTO getRoomById(Integer roomId) {
        RoomEntity room = roomRepository.findById(roomId)
                .orElseThrow(() -> new RuntimeException("Room not found"));
        return RoomMapper.toDTO(room);
    }

    @Override
    public List<RoomDTO> getAllRooms() {
        return roomRepository.findAll()
                .stream().map(RoomMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RoomDTO updateRoom(Integer roomId, RoomDTO roomDTO) {
        RoomEntity room = roomRepository.findById(roomId)
                .orElseThrow(() -> new RuntimeException("Room not found"));
        room.setRoom_name(roomDTO.getRoom_name());
        roomRepository.save(room);
        return RoomMapper.toDTO(room);
    }

    @Override
    public void deleteRoom(Integer roomId) {
        roomRepository.deleteById(roomId);
    }
}

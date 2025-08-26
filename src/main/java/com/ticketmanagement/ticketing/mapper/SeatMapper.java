package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.SeatDTO;
import com.ticketmanagement.ticketing.enums.SeatType;
import com.ticketmanagement.ticketing.model.entity.SeatEntity;

public class SeatMapper {
    public static SeatDTO toDTO(SeatEntity seat) {
        if (seat == null) return null;
        SeatDTO dto = new SeatDTO();
        dto.setSeatId(seat.getSeatId());
        dto.setRoomId(seat.getRoom() != null ? seat.getRoom().getRoomId() : null);
        dto.setRow(seat.getRow());
        dto.setNumber(seat.getNumber());
        dto.setSeatType(seat.getSeatType() != null ? seat.getSeatType().name() : null);
        return dto;
    }

    public static SeatEntity toEntity(SeatDTO dto) {
        if (dto == null) return null;
        SeatEntity seat = new SeatEntity();
        seat.setSeatId(dto.getSeatId());
        seat.setRow(dto.getRow());
        seat.setNumber(dto.getNumber());
        if (dto.getSeatType() != null) {
            seat.setSeatType(SeatType.valueOf(dto.getSeatType().toUpperCase()));
        }
        return seat;
    }
}
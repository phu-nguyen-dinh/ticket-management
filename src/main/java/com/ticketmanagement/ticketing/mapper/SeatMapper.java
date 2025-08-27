package com.ticketmanagement.ticketing.mapper;

import com.ticketmanagement.ticketing.dto.SeatDTO;
import com.ticketmanagement.ticketing.enums.SeatType;
import com.ticketmanagement.ticketing.model.entity.SeatEntity;

public class SeatMapper {
    public static SeatDTO toDTO(SeatEntity seat) {
        if (seat == null) return null;
        SeatDTO dto = new SeatDTO();
        dto.setSeat_id(seat.getSeat_id());
        dto.setRoom_id(seat.getRoom() != null ? seat.getRoom().getRoom_id() : null);
        dto.setRow(seat.getRow_name());
        dto.setNumber(seat.getNumber());
        dto.setSeat_type(seat.getSeat_type() != null ? seat.getSeat_type().name() : null);
        return dto;
    }

    public static SeatEntity toEntity(SeatDTO dto) {
        if (dto == null) return null;
        SeatEntity seat = new SeatEntity();
        seat.setSeat_id(dto.getSeat_id());
        seat.setRow_name(dto.getRow());
        seat.setNumber(dto.getNumber());
        if (dto.getSeat_type() != null) {
            seat.setSeat_type(SeatType.valueOf(dto.getSeat_type()));
        }
        return seat;
    }
}
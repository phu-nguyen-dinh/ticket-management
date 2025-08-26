package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.SeatDTO;
import com.ticketmanagement.ticketing.enums.SeatType;
import com.ticketmanagement.ticketing.mapper.SeatMapper;
import com.ticketmanagement.ticketing.model.entity.SeatEntity;
import com.ticketmanagement.ticketing.repository.SeatRepository;
import com.ticketmanagement.ticketing.services.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatRepository seatRepository;

    @Override
    public SeatDTO createSeat(SeatDTO seatDTO) {
        SeatEntity seat = SeatMapper.toEntity(seatDTO);
        seatRepository.save(seat);
        return SeatMapper.toDTO(seat);
    }

    @Override
    public SeatDTO getSeatById(Integer seatId) {
        SeatEntity seat = seatRepository.findById(seatId)
                .orElseThrow(() -> new RuntimeException("Seat not found"));
        return SeatMapper.toDTO(seat);
    }

    @Override
    public List<SeatDTO> getAllSeats() {
        return seatRepository.findAll()
                .stream().map(SeatMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public SeatDTO updateSeat(Integer seatId, SeatDTO seatDTO) {
        SeatEntity seat = seatRepository.findById(seatId)
                .orElseThrow(() -> new RuntimeException("Seat not found"));
        seat.setRow(seatDTO.getRow());
        seat.setNumber(seatDTO.getNumber());
        if (seatDTO.getSeatType() != null) {
            seat.setSeatType(SeatType.valueOf(seatDTO.getSeatType().toUpperCase()));
        }
        seatRepository.save(seat);
        return SeatMapper.toDTO(seat);
    }

    @Override
    public void deleteSeat(Integer seatId) {
        seatRepository.deleteById(seatId);
    }
}
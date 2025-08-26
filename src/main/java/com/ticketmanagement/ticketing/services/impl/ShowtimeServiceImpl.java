package com.ticketmanagement.ticketing.services.impl;

import com.ticketmanagement.ticketing.dto.ShowtimeDTO;
import com.ticketmanagement.ticketing.mapper.ShowtimeMapper;
import com.ticketmanagement.ticketing.model.entity.ShowtimeEntity;
import com.ticketmanagement.ticketing.repository.ShowtimeRepository;
import com.ticketmanagement.ticketing.services.ShowtimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ShowtimeServiceImpl implements ShowtimeService {

    @Autowired
    private ShowtimeRepository showtimeRepository;

    @Override
    public ShowtimeDTO createShowtime(ShowtimeDTO showtimeDTO) {
        ShowtimeEntity showtime = ShowtimeMapper.toEntity(showtimeDTO);
        showtimeRepository.save(showtime);
        return ShowtimeMapper.toDTO(showtime);
    }

    @Override
    public ShowtimeDTO getShowtimeById(Integer showtimeId) {
        ShowtimeEntity showtime = showtimeRepository.findById(showtimeId)
                .orElseThrow(() -> new RuntimeException("Showtime not found"));
        return ShowtimeMapper.toDTO(showtime);
    }

    @Override
    public List<ShowtimeDTO> getAllShowtimes() {
        return showtimeRepository.findAll()
                .stream().map(ShowtimeMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ShowtimeDTO updateShowtime(Integer showtimeId, ShowtimeDTO showtimeDTO) {
        ShowtimeEntity showtime = showtimeRepository.findById(showtimeId)
                .orElseThrow(() -> new RuntimeException("Showtime not found"));
        showtime.setStartTime(showtimeDTO.getStartTime());
        showtime.setEndTime(showtimeDTO.getEndTime());
        showtimeRepository.save(showtime);
        return ShowtimeMapper.toDTO(showtime);
    }

    @Override
    public void deleteShowtime(Integer showtimeId) {
        showtimeRepository.deleteById(showtimeId);
    }
}

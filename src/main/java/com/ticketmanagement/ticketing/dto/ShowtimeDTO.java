package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class ShowtimeDTO {
    private Integer showtime_id;
    private Integer event_id;
    private Integer room_id;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
}

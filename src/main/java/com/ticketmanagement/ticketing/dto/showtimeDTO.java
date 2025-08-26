package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class showtimeDTO {
    private Integer showtimeId;
    private Integer eventId;
    private Integer roomId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}

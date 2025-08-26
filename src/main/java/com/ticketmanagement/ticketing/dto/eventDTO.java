package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class eventDTO {
    private Integer eventId;
    private String title;
    private String description;
    private String type;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}

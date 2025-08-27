package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class EventDTO {
    private Integer event_id;
    private String title;
    private String description;
    private String type;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
}

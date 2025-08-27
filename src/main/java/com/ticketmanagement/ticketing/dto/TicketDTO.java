package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TicketDTO {
    private Integer ticket_id;
    private Integer showtime_id;
    private Integer seat_id;
    private Double price;
    private String status; // available, booked, sold
}

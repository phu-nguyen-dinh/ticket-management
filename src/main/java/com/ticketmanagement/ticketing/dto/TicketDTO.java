package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TicketDTO {
    private Integer ticketId;
    private Integer showtimeId;
    private Integer seatId;
    private Double price;
    private String status; // available, booked, sold
}

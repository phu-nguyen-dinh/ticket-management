package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SeatDTO {
    private Integer seatId;
    private Integer roomId;
    private String row;
    private Integer number;
    private String seatType; // VIP, Normal
}

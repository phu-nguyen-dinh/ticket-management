package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SeatDTO {
    private Integer seat_id;
    private Integer room_id;
    private String row_name;
    private Integer number;
    private String seat_type; // VIP, Normal
}

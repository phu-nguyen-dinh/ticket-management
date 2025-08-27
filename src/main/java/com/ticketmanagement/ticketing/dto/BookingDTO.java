package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class BookingDTO {
    private Integer booking_id;
    private Integer user_id;
    private Integer cust_id;
    private LocalDateTime booking_time;
    private Double total_amount;
    private String status; // pending, paid, cancelled
}

package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class BookingDTO {
    private Integer bookingId;
    private Integer userId;
    private Integer custId;
    private LocalDateTime bookingTime;
    private Double totalAmount;
    private String status; // pending, paid, cancelled
}

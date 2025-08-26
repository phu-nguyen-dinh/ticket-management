package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class paymentDTO {
    private Integer paymentId;
    private Integer bookingId;
    private String paymentMethod;
    private Double amount;
    private LocalDateTime paymentTime;
    private String status; // pending, paid, cancelled
}

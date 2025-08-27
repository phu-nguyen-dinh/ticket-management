package com.ticketmanagement.ticketing.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class PaymentDTO {
    private Integer payment_id;
    private Integer booking_id;
    private String payment_method;
    private Double amount;
    private LocalDateTime payment_time;
    private String status; // pending, paid, cancelled
}

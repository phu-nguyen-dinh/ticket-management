package com.ticketmanagement.ticketing.model.entity;

import com.ticketmanagement.ticketing.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "Payment")
@Getter
@Setter
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

    @OneToOne
    @JoinColumn(name = "bookingId")
    private BookingEntity booking;

    private String paymentMethod;
    private Double amount;
    private LocalDateTime paymentTime;

    @Enumerated(EnumType.STRING)
    private PaymentStatus status;
}
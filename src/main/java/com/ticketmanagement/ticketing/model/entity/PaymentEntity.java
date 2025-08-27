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
    @Column(name = "payment_id")
    private Integer payment_id;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private BookingEntity booking;

    @Column(name = "payment_method")
    private String payment_method;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "payment_time")
    private LocalDateTime payment_time;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PaymentStatus status;
}
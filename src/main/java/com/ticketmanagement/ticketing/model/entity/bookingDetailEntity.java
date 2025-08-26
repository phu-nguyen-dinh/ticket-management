package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BookingDetail")
@Getter
@Setter
public class bookingDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingDetailId;

    @ManyToOne
    @JoinColumn(name = "bookingId")
    private bookingEntity booking;

    @ManyToOne
    @JoinColumn(name = "ticketId")
    private ticketEntity ticket;

    private Double price;
}
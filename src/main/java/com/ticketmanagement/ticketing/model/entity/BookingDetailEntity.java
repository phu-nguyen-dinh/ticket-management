package com.ticketmanagement.ticketing.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BookingDetail")
@Getter
@Setter
public class BookingDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingDetailId;

    @ManyToOne
    @JoinColumn(name = "bookingId")
    private BookingEntity booking;

    @ManyToOne
    @JoinColumn(name = "ticketId")
    private TicketEntity ticket;

    private Double price;
}
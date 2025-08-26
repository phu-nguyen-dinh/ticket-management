package com.ticketmanagement.ticketing.model.entity;

import com.ticketmanagement.ticketing.enums.ticketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Ticket")
@Getter
@Setter
public class ticketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;

    @ManyToOne
    @JoinColumn(name = "showtimeId")
    private showtimeEntity showtime;

    @ManyToOne
    @JoinColumn(name = "seatId")
    private seatEntity seat;

    private Double price;

    @Enumerated(EnumType.STRING)
    private ticketStatus status;
}

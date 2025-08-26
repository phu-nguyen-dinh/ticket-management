package com.ticketmanagement.ticketing.model.entity;

import com.ticketmanagement.ticketing.enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Ticket")
@Getter
@Setter
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ticketId;

    @ManyToOne
    @JoinColumn(name = "showtimeId")
    private ShowtimeEntity showtime;

    @ManyToOne
    @JoinColumn(name = "seatId")
    private SeatEntity seat;

    private Double price;

    @Enumerated(EnumType.STRING)
    private TicketStatus status;
}
